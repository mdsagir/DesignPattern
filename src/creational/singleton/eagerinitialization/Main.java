package creational.singleton.eagerinitialization;

public class Main {

    public static void main(String[] args) {

        Cache cache1 = Cache.getInstance();
        Cache cache2 = Cache.getInstance();

        System.out.println(cache1.hashCode());
        System.out.println(cache2.hashCode());
    }
}
