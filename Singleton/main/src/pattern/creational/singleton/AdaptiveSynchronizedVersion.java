package pattern.creational.singleton;

/**
 * Using late creating and volatile (since Java 1.5). The most adaptive variant.
 */
public class AdaptiveSynchronizedVersion extends Singleton{
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
        super("AdaptiveSynchronizedVersion", 1);
    }
}
