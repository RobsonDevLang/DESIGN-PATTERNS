package singleton;

public class TesteSingleton {
    public static void main(String[] args) {
        System.out.println("SingletonLazy");
        SingletonLazy lazy = SingletonLazy.getInstance();
        SingletonLazy novo = SingletonLazy.getInstance();
        System.out.println(lazy);
        novo = SingletonLazy.getInstance();
        System.out.println(novo);

        System.out.println("\n---------------------------------\n");

        System.out.println("SingletonEager");
        SingletonEager eager = SingletonEager.getInstance();
        SingletonEager novoeager = SingletonEager.getInstance();
        System.out.println(eager);
        novoeager = SingletonEager.getInstance();
        System.out.println(novoeager);


        System.out.println("\n---------------------------------\n");

        System.out.println("LazyHoler");
        SingletonLazyHolder lazyHoleder = SingletonLazyHolder.getInstance();
        SingletonLazyHolder novoLazyHoler = SingletonLazyHolder.getInstance();
        System.out.println(lazyHoleder);
        novoLazyHoler = SingletonLazyHolder.getInstance();
        System.out.println(novoLazyHoler);
    }
}