package pattern.creational.singleton;

import org.apache.log4j.Logger;

/**
 * Synchronized method - not good because over after first executing
 */
public class FullSynchronizedVersion  extends Singleton {
    private static final Logger log = Logger.getLogger(FullSynchronizedVersion.class);
    static private FullSynchronizedVersion singleInstance;

    static {
        log.info("Class loader");
    }

    private static int allWent;
    private static int synchMethodWent;
    private static int nullWent;

    public synchronized static FullSynchronizedVersion getInstance(final int threadNumber) {
        synchMethodWent++;
        if (singleInstance == null) {
            nullWent++;
            singleInstance = new FullSynchronizedVersion(threadNumber);
        }
        allWent++;
        return singleInstance;
    }

    private FullSynchronizedVersion(final int threadNumber) {
        super("Full", threadNumber);
    }

    public static int getAllWent() {
        return allWent;
    }

    public static int getSynchMethodWent() {
        return synchMethodWent;
    }

    public static int getNullWent() {
        return nullWent;
    }
}