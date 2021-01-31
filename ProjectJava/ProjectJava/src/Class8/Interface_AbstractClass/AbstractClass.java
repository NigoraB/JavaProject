package Class8.Interface_AbstractClass;

public abstract class AbstractClass {

    int ab = 10;

    /**
     * Abstract Class:
     *      is a class which can have abstract methods as well as normal methods.
     *
     * we can create a variable but CANNOT create an object.
     */

    public void sayHelloFromAbstractClass() {
        System.out.println("Hello");
    }

    public static void staticMethod() {
        System.out.println("Inside Static method of Abstract class");
    }

    public abstract void firstAbstractMethod();

    public abstract int secondAbstractMethod();



}
