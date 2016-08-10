package pattern.creational.singleton;

public class AdaptiveSynchronizedVersion {
    private volatile static AdaptiveSynchronizedVersion singleInstance;

    public static AdaptiveSynchronizedVersion getInstance() {
        if (singleInstance == null) {
            synchronized (AdaptiveSynchronizedVersion.class) {
                if (singleInstance == null) {
                    singleInstance = new AdaptiveSynchronizedVersion();
                }
            }
        }
        return singleInstance;
    }

    private AdaptiveSynchronizedVersion() {

    }
}
