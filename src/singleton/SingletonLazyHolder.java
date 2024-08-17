package singleton;

/**
 * Padrão Singleton "Lazy holder"
 */

public class SingletonLazyHolder {
    private static class IntanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
    }

    public static SingletonLazyHolder getInstance() {
        return IntanceHolder.instancia;

    }

}
