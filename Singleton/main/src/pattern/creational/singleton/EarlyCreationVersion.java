package pattern.creational.singleton;

public class EarlyCreationVersion {
    private static EarlyCreationVersion singleInstance = new EarlyCreationVersion();

    public static EarlyCreationVersion getInstance() {
        return singleInstance;
    }

    private EarlyCreationVersion() {

    }
}
