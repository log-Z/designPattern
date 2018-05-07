package create.singletonPattern;

/**
 * 设计模式 - 单例模式
 *
 * 意图：    保证一个类仅有一个实例，并提供一个访问它的全局访问点。
 * 使用案例：某些有且仅有一个对象的类。
 * 备注：    懒汉模式需要进行双重检查锁。
 */
public class Client {

    public static void main(String[] args) {
        // 饿汉模式
        Earth earth = Earth.getInstance();
        // 懒汉模式
        Moon moon = Moon.getInstance();
        System.out.println("earth = " + earth);
        System.out.println("moon = " + moon);
    }

}
