package pattern.creational.singleton;

import org.apache.log4j.Logger;

/**
 * Using late creating and volatile (since Java 1.5). The most adaptive variant.
 */
public class AdaptiveSynchronizedVersion extends Singleton {
    private static final Logger log = Logger.getLogger(AdaptiveSynchronizedVersion.class);
    private volatile static AdaptiveSynchronizedVersion singleInstance;
    private volatile static int nullWent;
    private volatile static int allWent;
    private volatile static int synchIfWent;

    static {
        log.info("Class loader");
    }

    private AdaptiveSynchronizedVersion(final int threadNumber) {
        super("Adaptive", threadNumber);
    }

    public static AdaptiveSynchronizedVersion getInstance(final int n) {
        try {
            Thread.sleep(150);
        } catch (InterruptedException e) {
            log.error(e);
        }
        if (singleInstance == null) {
            nullWent++;
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                log.error(e);
            }
            synchronized (AdaptiveSynchronizedVersion.class) {
                try {
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    log.error(e);
                }
                if (singleInstance == null) {
                    synchIfWent++;
                    singleInstance = new AdaptiveSynchronizedVersion(n);
                }
            }
        }
        allWent++;
        return singleInstance;
    }

    public static int getNullWent() {
        return nullWent;
    }

    public static int getAllWent() {
        return allWent;
    }


    public static int getSynchIfWent() {
        return synchIfWent;
    }
}
