package pattern.creational.singleton;

/**
 * The most simple variant. Create singleton when classloader loads class. Using when object is not complex for creating or when singleton usually will be used.
 */
public class EarlyCreationVersion  extends Singleton{
    private static EarlyCreationVersion singleInstance = new EarlyCreationVersion();

    public static EarlyCreationVersion getInstance() {
        return singleInstance;
    }

    private EarlyCreationVersion() {
        super("EarlyCreationVersion", 1);
    }
}
