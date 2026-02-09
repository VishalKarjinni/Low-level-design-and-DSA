package creational_pattern.singleton;

public class EagerSingleton {
    private static final EagerSingleton eagerInstance = new EagerSingleton();
    private EagerSingleton() {}
    public static EagerSingleton getInstance() {
        return eagerInstance;
    }
}
