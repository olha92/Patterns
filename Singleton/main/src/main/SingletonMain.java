package main;

import org.apache.log4j.Logger;
import pattern.creational.singleton.AdaptiveSynchronizedVersion;
import pattern.creational.singleton.EarlyCreationVersion;
import pattern.creational.singleton.FullSynchronizedVersion;

/**
 * SingletonMain for example
 */
public class SingletonMain {
    private static final Logger log = Logger.getLogger(SingletonMain.class);
    private static final int SIZE = 105;

    public static void main(String[] args) {
        log.info("[Singleton] main starts");
        adaptiveSynchronizedVersionTest();
        earlyCreationVersionTest();
        fullSynchronizedVersionTest();
        log.info("[Singleton] main finishes");
    }

    private static void fullSynchronizedVersionTest() {
        log.info("[FullSynchronizedVersion] fullSynchronizedVersionTest starts");
        Thread[] fullSynches = new Thread[SIZE];
        for (int i = 0; i < SIZE; i++) {
            final int n = i;
            fullSynches[i] = new Thread(new Runnable() {
                private final Logger log = Logger.getLogger(Runnable.class);

                public void run() {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        log.error(e);
                    }
                    FullSynchronizedVersion.getInstance(n);
                }
            });
        }
        for (int i = 0; i < SIZE; i++) {
            fullSynches[i].start();
        }
        for (int i = 0; i < SIZE; i++) {
            try {
                fullSynches[i].join();
            } catch (InterruptedException e) {
                log.error(e);
            }
        }
        log.info("[FullSynchronizedVersion] getAllWent = " + FullSynchronizedVersion.getAllWent());
        log.info("[FullSynchronizedVersion] getNullWent = " + FullSynchronizedVersion.getNullWent());
        log.info("[FullSynchronizedVersion] getSynchMethodWent = " + FullSynchronizedVersion.getSynchMethodWent());
        log.info("[FullSynchronizedVersion] fullSynchronizedVersionTest finishes");
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
