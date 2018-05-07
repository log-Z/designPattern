package structure.proxyPattern.javaDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy implements InvocationHandler {

    private UserModelApi userModel;

    /**
     * 通过用户模型（源对象）获取代理
     * @param userModel    绑定用户模型（源对象）
     * @return              返回与用户模型绑定的代理
     */
    public UserModelApi getProxy(UserModel userModel) {
        this.userModel = userModel;
        // 运行时动态生成代理类的实例（根据UserModel类生成）
        return (UserModelApi) Proxy.newProxyInstance(
                userModel.getClass().getClassLoader(),      // 指定代理类的类加载器
                userModel.getClass().getInterfaces(),       // 指定代理类的需要实现的接口集
                this                                    // 指定代理类实例的方法（被调用时）的处理类对象
        );
    }

    /**
     * 代理类方法的调用处理
     * @param proxy         被调用的方法所在的代理对象
     * @param method        被调用的方法名
     * @param args          被调用的方法的参数列表
     * @return              被调用的方法的返回值
     * @throws Throwable    被调用的方法不存在时可能会抛出错误或异常
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 判断是否是setter方法
        if (method.getName().startsWith("set")) {
            // 检查权限
            if (userModel.getId() != null && userModel.getId().equals(args[1])) {
                // 交给用户模型对象（源对象）处理
                return method.invoke(userModel, args);
            } else {
                System.out.println("修改权限不足！");
                return false;
            }
        } else {
            return method.invoke(userModel, args);
        }
    }

}
