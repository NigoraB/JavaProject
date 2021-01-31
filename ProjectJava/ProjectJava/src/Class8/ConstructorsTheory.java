package Class8;

public class ConstructorsTheory extends ParentClass {
        /**
         * Constructors:
         * It's a special method,
         * 1. has same name as of the class.
         * 2. it CANNOT have a return type (not even void)
         * 3. when we create an object of the class,
         *  the constructor-method executes AUTOMATICALLY.
         *
         * 4. Constructor can be parameterized (can have arguments)
         * 5. we can have more than one Constructor in a class.
         *      This is called 'Constructor Overloading'
         * 6. Constructor can be public, protected or private
         * 7. In case of Inheritance: when I create a child object.
         *      parent-class Constructor will get called first then Child-class Constructor.
         */
        String name, addr;
    int id=0, age=0;
    static int custCount = 0;

     public ConstructorsTheory(String custName) {
         super(11);
         System.out.println("Inside Constructor Theory constructor - 1");
         id = ++custCount;
         name = custName;
     }

    public ConstructorsTheory(String custName, String custAddr, int custAge) {
         id = ++custCount;
        name = custName;
        addr = custAddr;
        age = custAge;
    }

    public ConstructorsTheory(int custAge, String custName, String custAddr) {
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

}
