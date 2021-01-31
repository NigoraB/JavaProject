package Class6;

import Class6.Inheritance.ABCD;
import Class6.Inheritance.EFGH;

public class MyMain {

    public static void main(String[] args) {

        /**
         * Syntax to create Object
         *
         * <className> <varName> = new <className>();
         *
         */
        /**
         * General:
         * m1 is the object of MyMethods class
         *
         * Technical:
         * m1 is the variable of MyMethods datatype,
         * which stores the object of MyMethods class
         */
        MyMethods m1 = new MyMethods(); // m1.num=11 , m1.name="" m1.count=0

        m1.sayHello();  // Hello
        m1.setName("m1 name"); // m1.num=11 m1.name="m1 name" m1.count=1
        System.out.println(m1.getNum());  // m1.num=11 m1.name="m1 name" m1.count=2

        MyMethods m2 = new MyMethods(); // m2.num=11 m2.name="" m2.count=2
        System.out.println(m2.getName()); // "" m2.num=11 m2.name="" m2.count=2
        System.out.println(m1.getName()); // m1 name m1.num=11 m1.name="m1 name" m1.count=2
        System.out.println(m2.getNum()); // 11 (m2.num=11 m2.name="" m2.count=3)
        System.out.println(m1.getName()); // m1 name (m1.num=11 m1.name="m1 name" m1.count=3)


        // to access static variable.methods, we need to use class name.
        MyMethods.sayHelloAgain();



        MyMethods c1 = new MyMethods();  // c1.id=0 , c1.name="" , custCount=0
        c1.signUp("Happy");     // c1.id=1 , c1.name="happy" , custCount=1

        MyMethods c2 = new MyMethods(); // c2.id=0 , c2.name="" , custCount=1
        c2.signUp("laugh");     // c2.id=2 , c2.name="laugh" , custCount=2

        c1.getCustDetail();
            // id = 1
            // Name = happy

        c2.getCustDetail();
            // id = 2
            // Name = Laugh

        System.out.println(MyMethods.getCustomerCount()); // 2

        MyMethods c3 = new MyMethods(); // c3.id=0 , c3.name="" , custCount=2
        c3.signUp("learn");     // c3.id=3 , c3.name="learn" , custCount=3

        MyMethods c4 = new MyMethods();
        c4.getCustDetail();

        System.out.println(MyMethods.getCustomerCount()); // 3

        c3.getCustDetail();
            // id = 3
            // Name = Learn




        EFGH e1 = new EFGH();
        e1.sayHello();

        ABCD a1 = new ABCD();

        e1.investment();

















    }

}
