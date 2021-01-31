package Class9;

import java.util.ArrayList;
import java.util.List;

public class List_ArrayList {
    public static void main(String[] args) {
        /**
         * Limitations of Array:
         * 1. User needs to know at least one of the below points, before creating an array.
         *      how many values do you want to store in array
         *          -- OR --
         *      all the values that you would like to store in the array.
         *
         * 2. Array length cannot be modified on run time.
         *
         * 3. We can store values of only single-datatype in array.
         *
         *
         * Syntax:
         *  ArrayList<datatypeClass> alName = new ArrayList<>();
         *      -- OR --
         *  List<datatypeClass> lName = new ArrayList<>();
         *
         * int -> Integer
         * double -> Double
         * char -> Character
         * boolean -> Boolean
         * String -> String
         *
         * eg:
         * ArrayList<Integer> alName = new ArrayList<>();
         *  -- OR--
         * List<Integer> lName = new ArrayList<>();
         *
         *
         * ArrayList is non-primitive datatype; which can store multiple values of
         *          same or multiple datatype depending upon how we have created it.
         *
         */

        int[] num = new int[5];

        List<Integer> alName = new ArrayList<>();   // values are getting added in the arrayList like Integer object
        System.out.println("After creation, length of alName list: " + alName.size());  // 0
        List<String> names = new ArrayList<>();

        List<Object> allTypes = new ArrayList<>();

        // List<Integer> alName = new ArrayList<>();
        // [] -- size=0

        // --> to add values in arraylist/list
        alName.add(11);     // [11] -- size=1
        alName.add(22);     // [11, 22] -- size=2
        alName.add(11);     // [11, 22, 11] -- size=3
        alName.add(44);     // [11, 22, 11, 44] -- size=4
        alName.add(55);     // [11, 22, 11, 44, 55] -- size=5 (lastIndex=4)
        alName.add(66);     // [11, 22, 11, 44, 55, 66] -- size=6 (lastIndex=5)
        alName.add(22);
        alName.add(11);
        alName.add(44);
        alName.add(77);

        /**
         * Note: ArrayList maintains the order of insertion (sequence of insertion)
         *
         * A, B, C, D   ->
         *      B, C, A, D
         *      A, B, C, D
         *      D, C, A, B
         *
         */

        allTypes.add(2);                        // Integer
        allTypes.add("my name");                // String
        allTypes.add(false);                    // Boolean
        allTypes.add('c');                      // Character
        // allTypes.add(2.2);

        Double d1 = new Double(2.2);
        allTypes.add(d1);                       // Double

        Collection_Java c1 = new Collection_Java();

        allTypes.add(new Collection_Java());    // Collection_Java

        // to find length (size) of arrayList
        System.out.println("Length of alName list: " + alName.size());  // 10

        // to print all values of arrayList
        System.out.println("alName list: " + alName);

        System.out.println("Adding 44 in alName");
        alName.add(44);

        // to find length (size) of arrayList
        System.out.println("Length of alName list: " + alName.size());  // 7

        // to print all values of arrayList
        System.out.println("alName list: " + alName);

        // to remove values (using values in remove, it will remove the first occurrence of the given value)
        // when using value with remove -> returns true if value is found and removed, else false
        // when using index with remove -> returns removedValue if index is found else IndexOutOfBoundsException
        System.out.println("Removed 44 : " + alName.remove(new Integer(44)));   // true
        System.out.println("alName list: " + alName);

        System.out.println("Removed from index-3 -> " + alName.remove(3));      // 55
        System.out.println("alName list: " + alName);


        // replace the value at specific index
        // if index found, replaces the value and returns the old value;
        // else IndexOutOfBoundsException
        System.out.println("value replaced at index-0 with 1000: " + alName.set(0, 1000));
        System.out.println("alName list: " + alName);

        // to retrieve value form arrayList
        // if index found -> returns the value at given index;
        // else IndexOutOfBoundsException
        System.out.println("Value at index-0: " + alName.get(0));

        // to find if a particular value is present in arrayList
        System.out.println("does alName contains 10: " + alName.contains(55));
        System.out.println("does alName contains 66: " + alName.contains(66));


        // to find index of a particular value (indexOf and lastIndexOf)
        // indexOf -> returns the index of FIRST OCCURRENCE of given value
        // if given value found, returns the index-value
        // else returns -1
        System.out.println("Index of 22 in alName: " + alName.indexOf(22));
        System.out.println("Index of 99 in alName: " + alName.indexOf(99));

        // lastIndexOf -> returns the index of LAST OCCURRENCE of given value
        // if given value found, returns the index-value
        // else returns -1
        System.out.println("Index of 22 in alName: " + alName.lastIndexOf(22));
        System.out.println("Index of 99 in alName: " + alName.lastIndexOf(99));


        // to check if my arrayList is empty or not
        System.out.println("does alName empty? : " + alName.isEmpty());
        System.out.println("Length of alName list: " + alName.size());
        System.out.println("alName list: " + alName);

        // to empty your arrayList
        alName.clear();

        System.out.println("does alName empty? : " + alName.isEmpty());
        System.out.println("Length of alName list: " + alName.size());
        System.out.println("alName list: " + alName);


        ArrayList<Integer> myarrayList = getArrayList();

    }


    public static ArrayList<Integer> getArrayList() {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(11);

        return al;
    }


}
