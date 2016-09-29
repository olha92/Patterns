package pattern.creational.singleton;

import org.apache.log4j.Logger;

public class Singleton {
    private static final Logger log = Logger.getLogger(Singleton.class);
    private String name;
    private int version;


    protected Singleton(String name, final int threadNumber) {
        this.name = name;
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            log.error(e);
        }
        this.version = threadNumber;
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            log.error(e);
        }
        log.info(String.format("#%s-%s constructor ", version, name));
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            log.error(e);
        }
    }

    @Override
    public String toString() {
        return String.format("%s-%s", version, name);
    }
}
