package creational.singleton.lazyloading;

public class Main {
    public static void main(String[] args) {
        Cache instance1 = Cache.getInstance();
        Cache instance2 = Cache.getInstance();

        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());

    }
}
