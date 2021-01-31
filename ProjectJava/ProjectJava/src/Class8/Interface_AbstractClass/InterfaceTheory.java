package Class8.Interface_AbstractClass;

public interface InterfaceTheory {

    // all field variables are static and final
    int a = 10;

    /**
     * 1. It looks like a class.
     * 2. It contains methods with signature ONLY (no body/code).
     *      Any method with ONLY signature but NO body/code is called Abstract Method.
     *      All methods in Interface are Abstract by default.
     * 3. It can NEVER contains method with body.
     *
     * 4. We can create variable of an interface, but
     *      we CANNOT create an object of an interface.
     *
     * 5. Class which is Implementing the interface,
     *      has to give body to all interface-methods.
     *
     * --> a class can IMPLEMENT any number of Interfaces.
     *
     * 6. Interface can have static method or default methods. <- Nigora
     * 7. Field variables in an interface are static and final by default. <- Alina and Nigora
     *
     *
     */

    public void sayHello();

    public void greetings(String username);

    public int findMax(int[] arr);

    public int findMax(int[] arr, int num);

    public static void abc() {
        System.out.println("Inside the abc of InterfaceTheory");
    }

    public default void myDefault() {
        System.out.println("Inside default method of InterfaceTheory");
    }

}
