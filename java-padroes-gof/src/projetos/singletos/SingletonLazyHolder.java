package projetos.singletos;

public class SingletonLazyHolder {

    // inner classe para thread safe.
    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();

    }

    public SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance() {
            return InstanceHolder.instancia;
        }
}


