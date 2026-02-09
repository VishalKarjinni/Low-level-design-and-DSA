package creational_pattern.singleton;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton threadSafeSingletonInstance;
    private ThreadSafeSingleton () {}
    /**
     *
     *  1. This approach is similar to lazy initialization but also
     *     ensures that the singleton is thread-safe.
     *  2. This is achieved by making the getInstance() method synchronized
     *     ensuring only one thread can execute this method at a time.
     *  3. When a thread enters the synchronized method, it acquires a lock on
     *     the class object.
     *     Other threads must wait until the method is executed.
     */
    public static synchronized ThreadSafeSingleton getInstance() {
         if (threadSafeSingletonInstance == null) {
             threadSafeSingletonInstance = new ThreadSafeSingleton();
         }
         return threadSafeSingletonInstance;
    }
}
