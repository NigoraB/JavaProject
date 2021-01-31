package Class7.Inheritance;

public class MyMain {
    public static void main(String[] args) {

        MyMethods m = new MyMethods();

        System.out.println(m.verifyStringIdentical(11,"",""));

        int[] nums = {11, 22, 33, 44, 11, 33};
        System.out.println(m.findMaxInIntArray(nums));


        System.out.println(m.isStringIdentical("Happy","HAPPY"));


        MyMethods m1 = new MyMethods();
        /**
         * childClass Reference -- ChildClass Object
         * object will get access to
         * childClass properties
         * and Parent Class properties
         * and grandParent Class properties (if exists)
         */
        m1.isStringIdentical("happy", "Happy");


        BaseMethods b1 = new BaseMethods();
        /**
         * parentClass Reference -- ParentClass Object
         * object will get access to
         * parent class properties
         * and, NO ACCESS to child class properties
         */
        System.out.println(b1.isStringIdentical("", "")); // methods from baseMethods

        BaseMethods b2 = new MyMethods();
        /**
         * parentClass Reference -- childClass Object
         * object will get access to
         * parent class properties
         * and, overridden properties in childClass.
         * and, NO ACCESS to child-specific properties.
         */
        System.out.println(b2.isStringIdentical("ha", "ok"));

        // MyMethods m2 = new BaseMethods();
        /**
         * childClass Reference -- parentClass Object
         * NOT ALLOWED!!
         *
         * if you have to store parentClass-Object in childClass-Reference,
         * then use casting. (in simple words, convert datatype of parentClass-Object into childClass-Object)
         *
         * MyMethods m2 = (MyMethods) new BaseMethods();
         */
















    }
}
