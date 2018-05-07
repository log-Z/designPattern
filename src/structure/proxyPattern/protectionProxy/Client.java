package structure.proxyPattern.protectionProxy;

/**
 * 设计模式 - 代理（保护代理）（使用Java静态代理实现）
 *
 * 意图：    为其他对象提供一种代理以控制对这个对象的访问。保护代理可以为一个对象被调用前后执行很多附加的操作。
 * 使用案例：对没有权限检测功能的对象扩展此功能。
 * 备注：    通过保护代理可以给目标对象增加功能，而且不用修改被代理类。
 */
public class Client {

    public static void main(String[] args) {
        UserModel userModel = new UserModel("001", "小明", "男", 22);
        Proxy proxy = new Proxy(userModel);
        boolean succeed;

        succeed = proxy.setId("123", "001");
        System.out.println(succeed);
        System.out.println("newId = " + proxy.getId());
        System.out.println();

        succeed = proxy.setName("小红", "001");
        System.out.println(succeed);
        System.out.println("newName = " + proxy.getName());
        System.out.println();

        succeed = proxy.setSex("女", "123");
        System.out.println(succeed);
        System.out.println("newSex = " + proxy.getSex());
        System.out.println();

        succeed = proxy.setAge(18, "233");
        System.out.println(succeed);
        System.out.println("newAge = " + proxy.getAge());
        System.out.println();
    }

}
