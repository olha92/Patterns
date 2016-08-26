package main;

import pattern.creational.singleton.AdaptiveSynchronizedVersion;
import pattern.creational.singleton.EarlyCreationVersion;
import pattern.creational.singleton.FullSynchronizedVersion;

/**
 * Main for example
 */
public class Main {
    public static void main(String[] args){
        AdaptiveSynchronizedVersion adaptive = AdaptiveSynchronizedVersion.getInstance();
        EarlyCreationVersion earlyCreation = EarlyCreationVersion.getInstance();
        FullSynchronizedVersion fullSynchronized = FullSynchronizedVersion.getInstance();
    }
}
