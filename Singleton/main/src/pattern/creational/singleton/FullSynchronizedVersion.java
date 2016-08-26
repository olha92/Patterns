package pattern.creational.singleton;

/**
 * Synchronized method - not good because over after first executing
 */
public class FullSynchronizedVersion  extends Singleton{
    static private FullSynchronizedVersion singleInstance;

    public synchronized static FullSynchronizedVersion getInstance() {
        if (singleInstance == null) {
            singleInstance = new FullSynchronizedVersion();
        }
        return singleInstance;
    }

    private FullSynchronizedVersion() {
        super("FullSynchronizedVersion", 1);
    }

}
