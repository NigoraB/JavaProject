package Class1_and_2;

import Class8.ConstructorsTheory;

public class Datatypes {
    public static void main(String[] args) {

    /**
     * Datatype:
     *      1. Primitive - byte, short, int, long , float, double , char , boolean
     *      2. Non Primitive - String, Array, User-defined class, Interface
     *
     * Syntax:
     * <datatype> <variableName> = <value>;
     * eg:
     * int age = 11;
     */
    /**
     * byte -> -128 to 127
     * short -> -32,768 to 32,767
     * int -> -2,147,000,000 to 2,147,000,000
     * long -> -9,000,000,000,000,000,000 to 9,000,000,000,000,000,000
     *
     * byte is primitive datatype and it can store values ranging from X to Y
     * eg: byte dogAge = 5;
     *
     */
    byte tempValue = 90;
    short daysInYear = 365;
    int covidCases = 8479837;
    long population = 89898390283092L;

    float mortgage = 1.1f;
    double bankBalance = 8978894.89;

    int num = 9899;
    double num1 = 9899;

        System.out.println(num);    // 9899
        System.out.println(num1);   // 9899.00


        char initial = '2';

        boolean isMorning = true;

        String fullName = "Happy Peace";

        /**
         * Array
         * is a datatype which can store multiple values of SAME datatype
         *
         * Before creating array, you should know one of the below things:
         * 1. how many values do you want to store in array
         * -- OR --
         * 2. all the values that you would like to store in the array
         *
         */
        /**
         * Syntax:
         * <datatype>[] <variableName> = new <datatype>[<noOfValues>];
         * <datatype> <variableName>[] = new <datatype>[<noOfValues>];
         * -- OR --
         * <datatype>[] <variableName> = {<val1>, <val2>, <val3>, <val4>, <val5>};
         * <datatype> <variableName>[] = {<val1>, <val2>, <val3>, <val4>, <val5>};
         */
        /**
         * Limitations: <- overcome by ArrayList
         * 1. Array can store only same datatype
         * 2. User cannot change (or increase/decrease) length of array.
         */
        String[] names = new String[5];     // {"" , "" , "" , "" , ""}
        int[] scores = new int[7];          // {  ,  ,  ,  ,  ,  ,  }

        String[] cityNames = {"new york" , "li", "jersey", "dallas" , "haw"};

        Datatypes d1;
        int number;
        String name;
        MyInterface i1;


        ConstructorsTheory c1 = new ConstructorsTheory(22, "happy", "tx");

        ConstructorsTheory c2 = new ConstructorsTheory("first");


    }
}
