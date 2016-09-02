package pattern.creational.singleton;

import org.apache.log4j.Logger;

/**
 * Synchronized method - not good because over after first executing
 */
public class FullSynchronizedVersion  extends Singleton{
    private static final Logger log = Logger.getLogger(FullSynchronizedVersion.class);
    static private FullSynchronizedVersion singleInstance;

    static {
        log.info("Class loader");
    }

    public synchronized static FullSynchronizedVersion getInstance(final int threadNumber) {
        if (singleInstance == null) {
            log.info("synch if, singleInstance = null, but singleInstance " + singleInstance);
            singleInstance = new FullSynchronizedVersion(threadNumber);
        }
        return singleInstance;
    }

    private FullSynchronizedVersion(final int threadNumber) {
        super("Full", threadNumber);
    }

}
