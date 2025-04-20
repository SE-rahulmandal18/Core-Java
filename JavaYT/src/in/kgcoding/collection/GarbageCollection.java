package in.kgcoding.collection;


import java.lang.ref.WeakReference;

public class GarbageCollection {
    public static void main(String[] args) {

        // WeakReference is a reference type that does not prevent its referent from being made
        // eligible for garbage collection. When the garbage collector determines that
        // the referent is weakly reachable, it clears the reference and allows the object to be collected.
        // WeakReference is useful for implementing caches or other data structures
        // where you want to allow the referent to be collected when memory is needed.

        WeakReference<Phone> phoneWeakReference = new WeakReference<>(new Phone("Apple", "16 pro max"));
        // The weak reference is still valid and can be used to access the referenced object
        System.out.println(phoneWeakReference.get());
        System.gc();
        try {
            Thread.sleep(10000);
        } catch (Exception ignored) {
        }
        // After 10sec  garbage collection called, the weak reference is cleared
        System.out.println(phoneWeakReference.get());


        // Strong Reference
        // StrongReference is the default reference type in Java. It prevents the referent from being
        // garbage collected as long as the reference exists. StrongReference is used for most objects
        // in Java, and it is the most common type of reference.
        // When an object is strongly reachable, it cannot be collected by the garbage collector.

//        Phone phone = new Phone("Samsung", "S23 Ultra");
//        System.out.println(phone);
//        phone = null;
//        System.out.println(phone);
    }
}

class Phone {
    String brand;
    String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}