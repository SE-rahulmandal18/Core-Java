package static_and_this;

public class MyClass {
    static int staticVar = 10;
    int nonStaticVar = 12;

    static void staticMethod(){
        System.out.println("This is a static method");
    }

    void instanceMethod() {
        System.out.println("this is a instance method");

        System.out.println( staticVar=100);
        System.out.println(nonStaticVar=200);
    }



    public static void main(String[] args) {
        staticVar = 11;
        System.out.println(staticVar);

//        nonStaticVar=15; // cannot be accessed from a static context


        MyClass.staticMethod();

        MyClass myClass = new MyClass();
        myClass.instanceMethod();

        System.out.println(myClass.nonStaticVar=20);
    }
}
