package main;

import org.apache.log4j.Logger;
import pattern.creational.singleton.AdaptiveSynchronizedVersion;
import pattern.creational.singleton.EarlyCreationVersion;

/**
 * Main for example
 */
public class Main {
    private static final Logger log = Logger.getLogger(Main.class);
    private static final int SIZE = 105;

    public static void main(String[] args) {
        log.info("[Singleton] main starts");
        adaptiveSynchronizedVersionTest();
        earlyCreationVersionTest();
        log.info("[Singleton] main finishes");
//            EarlyCreationVersion earlyCreation = EarlyCreationVersion.getInstance();
//            FullSynchronizedVersion fullSynchronized = FullSynchronizedVersion.getInstance();
    }

    private static void adaptiveSynchronizedVersionTest() {
        log.info("[AdaptiveSynchronizedVersion] adaptiveSynchronizedVersionTest starts");
        Thread[] adaptives = new Thread[SIZE];
        for (int i = 0; i < SIZE; i++) {
            final int n = i;
            adaptives[i] = new Thread(new Runnable() {
                private final Logger log = Logger.getLogger(Runnable.class);

                public void run() {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        log.error(e);
                    }
                    AdaptiveSynchronizedVersion.getInstance(n);
                }
            });
        }
        for (int i = 0; i < SIZE; i++) {
            adaptives[i].start();
        }
        for (int i = 0; i < SIZE; i++) {
            try {
                adaptives[i].join();
            } catch (InterruptedException e) {
                log.error(e);
            }
        }
        log.info("[AdaptiveSynchronizedVersion] getAllWent = " + AdaptiveSynchronizedVersion.getAllWent());
        log.info("[AdaptiveSynchronizedVersion] getNullWent = " + AdaptiveSynchronizedVersion.getNullWent());
        log.info("[AdaptiveSynchronizedVersion] getSynchIfWent = " + AdaptiveSynchronizedVersion.getSynchIfWent());
        log.info("[AdaptiveSynchronizedVersion] adaptiveSynchronizedVersionTest finishes");
    }

    private static void earlyCreationVersionTest() {
        log.info("[EarlyCreationVersion] earlyCreationVersionTest starts");
        Thread[] earlyCreationes = new Thread[SIZE];
        for (int i = 0; i < SIZE; i++) {
            earlyCreationes[i] = new Thread(new Runnable() {
                private final Logger log = Logger.getLogger(Runnable.class);

                public void run() {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        log.error(e);
                    }
                    EarlyCreationVersion.getInstance();
                }
            });
        }
        for (int i = 0; i < SIZE; i++) {
            earlyCreationes[i].start();
        }
        for (int i = 0; i < SIZE; i++) {
            try {
                earlyCreationes[i].join();
            } catch (InterruptedException e) {
                log.error(e);
            }
        }
        log.info("[EarlyCreationVersion] getAllWent = " + EarlyCreationVersion.getAllWent());
        log.info("[EarlyCreationVersion] earlyCreationVersionTest finishes");
    }
}
