package structure.proxyPattern.virtualProxy;

import java.util.Collection;

/**
 * 设计模式 - 代理（虚代理）（使用Java静态代理实现）
 *
 * 意图：    为其他对象提供一种代理以控制对这个对象的访问。虚代理是针对数据模型对象的代理。
 *           初始时只需加载部分数据到虚代理中，使用时如果读取到虚代理中未加载的数据，那么虚代理会动态地加载这些数据。
 * 使用案例：默认折叠但可以展开的数据模型。
 * 备注：    可以有效减少数据浪费，但动态加载会导致（数据库等）查询次数增加。
 */
public class Client {

    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        Collection<UserModelApi> col = userManager.getUserById("001");

        for (UserModelApi umApi : col) {
            System.out.println("id = " + umApi.getId() + ", name = " + umApi.getName());
        }

        for (UserModelApi umApi : col) {
            System.out.println("id = " + umApi.getId() + ", name = " + umApi.getName()
                    + ", sex = " + umApi.getSex() + ", age = " + umApi.getAge());
        }
    }

}
