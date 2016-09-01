package pattern.creational.singleton;

import org.apache.log4j.Logger;

/**
 * Using late creating and volatile (since Java 1.5). The most adaptive variant.
 */
public class AdaptiveSynchronizedVersion extends Singleton{
    private static final Logger log = Logger.getLogger(AdaptiveSynchronizedVersion.class);

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
