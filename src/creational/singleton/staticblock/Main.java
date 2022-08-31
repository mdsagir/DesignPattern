package creational.singleton.staticblock;

public class Main {
    public static void main(String[] args) {
        Cache instance1 = Cache.getInstance();
        Cache instance2 = Cache.getInstance();

        System.out.println(instance1);
        System.out.println(instance2);
    }
}
