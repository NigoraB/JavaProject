package Class9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ExceptionsTheory {
    public static void main(String[] args) {

        /**
         * Exceptions - unexpected code/situation.
         *
         * Types:
         * 1. Compile Time Exception
         * 2. Run Time Exception
         */

        System.out.println("Hello World");

        // Compile Time Exception
        File f = new File("");
        File f1 = new File("");
        try {
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("File-f not found, pls provide correct path");
            try {
                FileInputStream fis = new FileInputStream(f1);
            } catch (FileNotFoundException e1) {
                System.out.println("File-f1 not found, pls provide correct path");
            }
        }

        try {
            Thread.sleep(5000);     // 1 sec = 1000 millis
        } catch (InterruptedException e) {
            System.out.println("Exception during thread.sleep");
        }


        // Run Time Exception
        int[] numbers = {11, 22, 33, 44, 55};
        System.out.println(numbers[4]);     // 55
        try {
            System.out.println(numbers[7]);     // Exception - ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index for Array");
        }
        System.out.println(numbers[2]);     //

        String name = "hello";
        try {
            System.out.println(name.charAt(10));      // Exception - StringIndexOutOfBoundsException
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Invalid index for String");
        }

        System.out.println("\n\nUsing single-try with multiple catch block\n\n");
        // one try can have multiple catch blocks

        try {
            FileInputStream fis = new FileInputStream(f);       // Exception - FileNotFoundException

            Thread.sleep(5000);     // 1 sec = 1000 millis  // Exception - InterruptedException

            // Run Time Exception
            System.out.println(numbers[4]);     // 55
            System.out.println(numbers[7]);     // Exception - ArrayIndexOutOfBoundsException
            System.out.println(numbers[2]);     //

            System.out.println(name.charAt(10));      // Exception - StringIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index for Array");
        } catch (FileNotFoundException e1) {
            System.out.println("File-f is not found, try to use file-f1");
            try {
                FileInputStream fis = new FileInputStream(f1);
            } catch (FileNotFoundException ef1) {
                System.out.println("File-f1 is not found, try to use file-f1");
            }
        } catch (InterruptedException e2) {
            System.out.println("Exception during thread.sleep");
        } catch (StringIndexOutOfBoundsException e3) {
            System.out.println("Invalid index for String");
        } finally { // only one finally block with one try-catch block
            // block of code which will execute/run in all situation
            // (in other words, block which will execute irrespective of exception)

            System.out.println("In the finally block");
        }

        System.out.println("The end");


        /**
         * try
         *      connect with db
         *      execute some sql query
         *      store result in a variable
         *
         * catch
         *      handle if exception occur
         *
         * finally
         *      close the connection with db
         *
         */


    }
}
