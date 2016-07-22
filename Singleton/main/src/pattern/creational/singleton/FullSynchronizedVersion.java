package pattern.creational.singleton;

public class FullSynchronizedVersion {
    static private FullSynchronizedVersion singleInstance;

    public synchronized static FullSynchronizedVersion getInstance() {
        if (singleInstance == null) {
            singleInstance = new FullSynchronizedVersion();
        }
        return singleInstance;
    }

    private FullSynchronizedVersion() {
    }

}
