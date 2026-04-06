interface A {
    default void show() {
        System.out.println("A");
    }
}

interface B {
    default void show() {
        System.out.println("B");
    }
}

class C implements A, B {
    @Override
    public void show() {
      
//If multiple interfaces provide the same default method, the implementing class must override it and decide which one to use
        A.super.show(); // you can change to B.super.show()
    }
}

public class Main {
    public static void main(String[] args) {
        C obj = new C();
        obj.show(); // prints A
    }
}
