package singleton;


/**
 * 饿汉式(Eager initialization)
 */
public final class EagerSingleton {
    private final static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public EagerSingleton getInstance() {
        return instance;
    }
}
