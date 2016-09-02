package pattern.creational.singleton;

import org.apache.log4j.Logger;

/**
 * The most simple variant. Create singleton when classloader loads class. Using when object is not complex for creating or when singleton usually will be used.
 */
public class EarlyCreationVersion extends Singleton {
    private static final Logger log = Logger.getLogger(EarlyCreationVersion.class);
    private static EarlyCreationVersion singleInstance;
    private volatile static int allWent;

    static {
        log.info("Start class loader");
        singleInstance = new EarlyCreationVersion(-100);
        log.info("Finish class loader");
    }

    private EarlyCreationVersion(final int threadNumber) {
        super("Early", threadNumber);
    }

    public static EarlyCreationVersion getInstance() {
        allWent++;
        return singleInstance;
    }

    public static int getAllWent() {
        return allWent;
    }
}
