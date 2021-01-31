package Class1_and_2;

import java.util.Arrays;

public class Array_Concept {
    public static void main(String[] args) {
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

        int[] values = {22, 43, 65, 89, 11};
        /**
         * 22   -   index-0
         * 43   -   index-1
         * 65   -   index-2
         * 89   -   index-3
         * 11   -   index-4 (lastIndex = length -1)
         *
         * Length = 5
         */

        // length of Array
        int totalValuesInArray = values.length;
        System.out.println("Total values in '" + Arrays.toString(values) + "' is: " + totalValuesInArray);

        System.out.println("Value at index-2: " + values[2]); // if index is present -> value at the index
        int valueAt2 = values[2];

        // System.out.println("Value at index-99: " + values[99]); // if index is not present -> ArrayIndexOutOfBoundsException

        String[] words = new String[5];     // {"", "", "", "", ""}
        words[0] = "happy";                 // {"happy", "", "", "", ""}
        words[3] = "peace";                 // {"happy", "", "", "peace", ""}
        words[1] = "world";                 // {"happy", "world", "", "peace", ""}
        words[2] = "laugh";                 // {"happy", "world", "laugh", "peace", ""}
        words[4] = "grow";                  // {"happy", "world", "laugh", "peace", "grow"}


        /*
            Operators
            String and it's methods
            Array/ArrayList
            conditional loops (if-else/switch)
            Loops (for, while, do-while)
         */


    }
}
