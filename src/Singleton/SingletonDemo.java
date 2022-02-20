package Singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        DbSingleton a = DbSingleton.getInstance();
        System.out.println(a);

        DbSingleton b = DbSingleton.getInstance();
        System.out.println(b);
    }
}
