package projetos.singletos;

public class SingletonMain {
    public static void main(String[] args) {

        // Testes relacionados ao Design Pattern Singleton:
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstance();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstance();
        System.out.println(holder);

        SingletonLazyHolder holder2 = SingletonLazyHolder.getInstance();
        System.out.println(holder2);
        holder2 = SingletonLazyHolder.getInstance();
        System.out.println(holder2);
    }
}
