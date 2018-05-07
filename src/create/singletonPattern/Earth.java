package create.singletonPattern;

/**
 * 单例模式（饿汉模式）
 */
public class Earth {

    private final static Earth INSTANCE = new Earth();

    private Earth() {
    }

    public static Earth getInstance() {
        return INSTANCE;
    }

}
