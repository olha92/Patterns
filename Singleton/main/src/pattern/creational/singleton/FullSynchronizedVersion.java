package pattern.creational.singleton;

import org.apache.log4j.Logger;

/**
 * Synchronized method - not good because over after first executing
 */
public class FullSynchronizedVersion  extends Singleton{
    private static final Logger log = Logger.getLogger(FullSynchronizedVersion.class);

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
