package projetos.singletos;

public class SingletonLazy {
    private static SingletonLazy instancia;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstance() {
        if (instancia == null) {
            return instancia = new SingletonLazy();
        }
        return instancia;
    }
}
