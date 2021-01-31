package Class6;

public class MyMethods {
    /**
     * Method: lines of code to perform a specific task.
     *
     * Syntax:
     * <access-Modifier> [static] <void|datatype-Of-returned-value> <methodName> (blank | <datatype1> <var1>, <datatype2> <var2>) {
     *     // code
     * }
     *
     */
    // Field variables, Global variables, Class variables
    int num = 11;
    static int count = 0;


    String name, addr;
    int id=0, age=0;
    static int custCount = 0;


    public void signUp(String custName) {
        id = ++custCount;
        name = custName;
    }

    public void signUp(String custName, String custAddr, int custAge) {
        id = ++custCount;
        name = custName;
        addr = custAddr;
        age = custAge;
    }

    public void signUp(int custAge, String custName, String custAddr) {
        id = ++custCount;
        name = custName;
        addr = custAddr;
        age = custAge;
    }

    public static int getCustomerCount() {
        return custCount;
    }

    public void getCustDetail() {
        System.out.println("id = " + id);
        System.out.println("Name: " + name.toUpperCase());
    }

    // Create a method to say Hello
    public void sayHello() {
        System.out.println("Hello");
    }

    public static void sayHelloAgain() {
        System.out.println("Hello Again");
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        count++;
        return num;
    }

    public void setName(String newName) {
        count++;
        name = newName;
    }

    public void setNum(int newNum) {
        num = newNum;
    }








}
