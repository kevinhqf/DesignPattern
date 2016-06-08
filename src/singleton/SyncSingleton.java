package singleton;


/**
 * 同步锁方式
 */
public final class SyncSingleton {
    private static SyncSingleton instance = null;
    private SyncSingleton(){}
    public static SyncSingleton getInstance(){
        synchronized(SyncSingleton.class){
            if (null == instance) {
                instance=new SyncSingleton();
            }
        }
        return instance;
    }
}
