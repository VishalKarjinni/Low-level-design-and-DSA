package creational_pattern.singleton;

public class LazySingletonPattern {

    /**
     *  Lazy Initialization :-
     *  This approach creates the singleton instance only when it is needed,
     *  saving resources if the singleton is never used in the application.
     */

    private static LazySingletonPattern instance;

    private LazySingletonPattern () {}

    public LazySingletonPattern getInstace() {
        if (instance == null) {
            instance = new LazySingletonPattern();
        }
        return instance;
    }
}
