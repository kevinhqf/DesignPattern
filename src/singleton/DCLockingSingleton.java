package singleton;



/**
 * 双重校验锁(Double-Checked Locking)
 */
public final class DCLockingSingleton {
    private static DCLockingSingleton instance = null;

    private DCLockingSingleton() {
    }

    public static DCLockingSingleton getInstance() {
        if (null == instance) {
            synchronized (DCLockingSingleton.class) {
                if (null == instance) {
                    instance = new DCLockingSingleton();
                }
            }
        }
        return instance;
    }
}
