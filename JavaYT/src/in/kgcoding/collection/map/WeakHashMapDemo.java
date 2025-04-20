package in.kgcoding.collection.map;
import java.util.Map;
import java.util.WeakHashMap;

/**
 * WeakHashMap is a hash table based implementation of the Map interface
 * that allows keys to be garbage collected when they are no longer in use.
 * It is useful for implementing memory-sensitive caches.
 *
 * WeakHashMap is not synchronized and should not be used in concurrent applications
 * without external synchronization.
 */
public class WeakHashMapDemo {
    public static void main(String[] args) {
        WeakHashMap<String, Image> imageCache = new WeakHashMap<>();
        loadCache(imageCache);
        System.out.println(imageCache);
        System.gc();
        simulateApplicationRunning();
        System.out.println("Cache after running (some entries may be cleared): " + imageCache);
    }

    /**
     * Loads the cache with some images.
     * The keys are weakly referenced, so they can be garbage collected.
     *
     * @param imageCache the WeakHashMap to load
     */
    public static void loadCache(Map<String, Image> imageCache) {
        String k1 = new String("img1");
        String k2 = new String("img2");
        imageCache.put(k1, new Image("Image 1"));
        imageCache.put(k2, new Image("Image 2"));
    }


    /**
     * Simulates the application running for a while.
     * This is to demonstrate that the WeakHashMap entries may be cleared
     * after garbage collection.
     */
    private static void simulateApplicationRunning() {
        try {
            System.out.println("Simulating application running...");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Image {
    private String name;

    public Image(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}