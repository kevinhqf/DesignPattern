package singleton;



/**
 * 懒汉式(Lazy initialization)
 */
public final class LazySingleton {
    private static LazySingleton instance = null;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (null == instance) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
