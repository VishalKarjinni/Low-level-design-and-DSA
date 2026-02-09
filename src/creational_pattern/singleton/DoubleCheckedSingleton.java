package creational_pattern.singleton;

public class DoubleCheckedSingleton {
    private static volatile DoubleCheckedSingleton doubleCheckedSingletonInstance;
    private DoubleCheckedSingleton() {}

    /**
     *
     *  1. This approach minimizes performance overhead from synchronization
     *     by only synchronizing when the object is first created.
     *  2. It uses the volatile keyword to ensure that changes to the instance
     *     variable are immediately visible to other threads.
     *
     */
    public static DoubleCheckedSingleton getInstance() {
        if (doubleCheckedSingletonInstance == null) {
            synchronized (DoubleCheckedSingleton.class) {
                if (doubleCheckedSingletonInstance == null) {
                    doubleCheckedSingletonInstance = new DoubleCheckedSingleton();
                }
            }
        }
        return doubleCheckedSingletonInstance;
    }
}
