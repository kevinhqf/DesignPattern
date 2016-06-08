package singleton;



/**
 * 静态内部类
 */
public final class StaticHolderSingleton {
    private StaticHolderSingleton() {
    }

    private static class SingletonHolder {
        private static final StaticHolderSingleton instance = new StaticHolderSingleton();
    }

    public static StaticHolderSingleton getInstance() {
        return SingletonHolder.instance;
    }
}
