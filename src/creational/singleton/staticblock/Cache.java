package creational.singleton.staticblock;

/**
 * This is similar to eager initialization but
 */
public class Cache {

    private static Cache CACHE = null;

    private Cache() {
        System.out.println("Instantiate...Static Block...");
    }

    static {
        try {
            CACHE = new Cache();
        } catch (Exception e) {
            System.out.println("Exception " + e.toString());
        }
    }

    public static Cache getInstance() {
        return CACHE;
    }
}
