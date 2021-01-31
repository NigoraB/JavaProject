package Class8.Interface_AbstractClass;

public interface InterfaceTheory2 {
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
     */

    public void sayHello2();

    public void greetings2(String username);

    public int findMax2(int[] arr);

    public int findMax2(int[] arr, int num);

}
