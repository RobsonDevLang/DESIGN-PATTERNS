package singleton;

/**
 * Padrão Singleton "preguiçoso"
 */
public class SingletonLazy {

    private static  SingletonLazy instancia;

    private SingletonLazy(){
    }

    public static SingletonLazy getInstance(){
        if (instancia==null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }

}
