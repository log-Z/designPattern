package create.singletonPattern;

/**
 * 单例模式（懒汉模式）
 */
public class Moon {

    // 必须使用“volatile”修饰，防止被重排序
    private static volatile Moon INSTANCE;

    private Moon() {
    }

    public static Moon getInstance() {
        // 必须双重检查锁
        if (INSTANCE == null) {              // 检查第一次
            synchronized (Moon.class) {     // 加锁
                if (INSTANCE == null) {      // 检查第二次
                    INSTANCE = new Moon();
                }
            }
        }
        return INSTANCE;
    }

}
