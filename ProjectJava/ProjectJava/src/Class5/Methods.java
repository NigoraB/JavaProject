package Class5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Methods {
    /**
     * Method: lines of code to perform a specific task.
     *
     * Syntax:
     * <access-Modifier> [static] <void|datatype-Of-returned-value> <methodName> (blank | <datatype1> <var1>, <datatype2> <var2>) {
     *     // code
     * }
     *
     */

    public static void main(String[] args) {
        String name = "happy";

        System.out.println(name.toUpperCase());

        System.out.println(name.length());

        sayhelloWorld();

        //Nigora
        sayHelloToUser1("Nigora");
        // System.out.println(sayHelloToUser1("world"));
        // String abc = sayHelloToUser1("Nigora");

        // Alina
        System.out.println(sayHelloToUser("world"));
        String helloStatement = sayHelloToUser("world");
        if (helloStatement.equalsIgnoreCase("")) {

        }

        int int1 = 11;
        int int2 = 5;

        int addition = addTwoInts(int1, int2);
        System.out.println(int1 + " + " + int2 + " = " + addition);

        System.out.println(int1 + " + " + int2 + " = " + addTwoInts(11, 5));

        if (divideTwoNums(0, 11) > 2) {
            System.out.println("hello");
        }

        System.out.println(2/0);

        deposit(-900);

    }

    static double currentBalance = 10000;
    public static double deposit(double depositMoney) {
        currentBalance = currentBalance + depositMoney; // 10000 - 900
        return currentBalance;
    }

    // method to add two int values
    // Input: 2 (int , int)
    // ReturnType: int
    public static int addTwoInts(int num1, int num2) {
        int res = num1 + num2;
        return res;
    }

    // method to divide two int values
    // Input: 2 (int, double)
    // ReturnType: double
    public static double divideTwoNums(int num1, double num2) {
        double div;
        if (num1 == 0) { // 2/0=0 -> Infinity (Undefined) 0/2=0
            div = 0;
        } else {
            div = num2/num1;
        }
        return div;
    }






    // method to print Hello World
    public static void sayhelloWorld() {
        System.out.println("Hello World");
    }

    // write method to print Hello <username>
    public static String sayHelloToUser(String username) {
        return ("Hello " + username);
    }

    public static void sayHelloToUser1 (String username) {
        System.out.println("Hello " + username);
    }



}
