package creational.singleton.eagerinitialization;

/**
 * The instance of class in create when class is loading
 * Drawback: Instance will create even though client might not be using it
 */
public class Cache {

    private static final Cache CACHE = new Cache();

    private Cache() {
        System.out.println("Instantiate...");
    }

    public static Cache getInstance() {
        return CACHE;
    }
}
