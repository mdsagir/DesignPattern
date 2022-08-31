package creational.singleton.lazyloading;

import java.util.Objects;

public class Cache {

    private static Cache cache = null;

    private Cache() {
        // to prevent the reflection
        if (Objects.nonNull(cache)) {
            throw new RuntimeException("Object already instantiated...");
        }
    }

    public static Cache getInstance() {
        if (Objects.isNull(cache)) {
            synchronized (Cache.class) {
                if (Objects.isNull(cache)) {
                    cache = new Cache();
                }
            }
        }
        return cache;
    }

    // to prevent deserialized
    public Object readResolve() {
        return getInstance();
    }

    // to prevent cloning
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
