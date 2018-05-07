package structure.proxyPattern.javaDynamicProxy;

/**
 * 设计模式 - 代理（保护代理）（使用Java动态代理实现）
 *
 * 意图：    为其他对象提供一种代理以控制对这个对象的访问。保护代理可以为一个对象被调用前后执行很多附加的操作。
 * 使用案例：对没有权限检测功能的对象扩展此功能。
 * 备注：    通过保护代理可以给目标对象增加功能，而且不用修改被代理类。
 * 
 *           在Java中，所有代理都可以用静态和动态两种方法实现。
 *           如果改动了被代理类，那么静态代理类要重写大量代码，但动态代理只需修改规则即可。
 *           动态代理有利于后期维护。
 */
public class Client {

    public static void main(String[] args) {
        UserModel userModel = new UserModel("001", "小明", "男", 22);
        DynamicProxy dynamicProxy = new DynamicProxy();
        UserModelApi umApi = dynamicProxy.getProxy(userModel);
        boolean succeed;

        succeed = umApi.setId("123", "001");
        System.out.println(succeed);
        System.out.println("newId = " + umApi.getId());
        System.out.println();

        succeed = umApi.setName("小红", "001");
        System.out.println(succeed);
        System.out.println("newName = " + umApi.getName());
        System.out.println();

        succeed = umApi.setSex("女", "123");
        System.out.println(succeed);
        System.out.println("newSex = " + umApi.getSex());
        System.out.println();

        succeed = umApi.setAge(18, "233");
        System.out.println(succeed);
        System.out.println("newAge = " + umApi.getAge());
        System.out.println();
    }

}
