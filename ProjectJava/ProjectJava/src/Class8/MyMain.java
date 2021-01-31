package Class8;

import Class8.Interface_AbstractClass.AbstractClass;
import Class8.Interface_AbstractClass.InterfaceTheory;
import Class8.Interface_AbstractClass.MyClass;

public class MyMain {
    public static void main(String[] args) {

        ConstructorsTheory c1 = new ConstructorsTheory("happy");
        c1.getCustDetail();


        ConstructorsTheory c2 = new ConstructorsTheory("learn", "nyc", 22);
        c2.getCustDetail();
/**
        PrivateContructor.sayHello();
        PrivateContructor.sayHello("username");

        Math.abs(-10); // 10*/


        // InterfaceTheory i1 = new InterfaceTheory();

        InterfaceTheory m1 = new MyClass();
        m1.greetings("myName");
        m1.myDefault();

        /**
         * MyClass -> InterfaceTheory
         *
         * ChromeDriver -> RemoteWebDriver -> WebDriver
         * WebDriver driver = new ChromeDriver();
         * driver.get("");
         */

        InterfaceTheory.abc();
        System.out.println(InterfaceTheory.a);

        AbstractClass a1 = new MyClass();



    }
}
