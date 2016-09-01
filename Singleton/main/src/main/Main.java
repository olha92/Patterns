package main;

import org.apache.log4j.Logger;
import pattern.creational.singleton.AdaptiveSynchronizedVersion;
import pattern.creational.singleton.EarlyCreationVersion;
import pattern.creational.singleton.FullSynchronizedVersion;

/**
 * Main for example
 */
public class Main {
    private static final Logger log = Logger.getLogger(Main.class);

    public static void main(String[] args){
        log.info("[Singleton] main starts");
        AdaptiveSynchronizedVersion adaptive = AdaptiveSynchronizedVersion.getInstance();
        EarlyCreationVersion earlyCreation = EarlyCreationVersion.getInstance();
        FullSynchronizedVersion fullSynchronized = FullSynchronizedVersion.getInstance();

        log.info("[Singleton] main finishes");
    }
}
