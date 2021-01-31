package Class11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set_HashSet {
    public static void main(String[] args) {

        /**
         * Set is an Interface, child of Collection Interface.
         * HashSet implements Set Interface.
         *
         * Set: it's a non-primitive datatype which can store multiple values but NO duplicates.
         *
         * Syntax to create a Set/HashSet:
         * HashSet<datatypeClass> hashSetname = new HashSet<>();
         *      -- OR --
         * Set<datatypeClass> setName = new HashSet<>();
         *
         * List vs Set
         * 1. List can have duplicate values; Set cannot have duplicate values.
         * 2. List maintains the order of insertion whereas Set doesn't main the order of insertion.
         *    bcz, Set uses Hashing technique to store the values.
         *
         */


        Set<Double> mortgageRates = new HashSet<>();

        // to find the size ( or length) of Set
        System.out.println("Size of mortgageRates set -> " + mortgageRates.size());     // 0

        // to add values in Set/HashSet
        mortgageRates.add(1.1);
        mortgageRates.add(0.5);
        mortgageRates.add((double) 2);   // 2.0
        mortgageRates.add(3.14);
        mortgageRates.add(1.1);
        mortgageRates.add(4.1);

        System.out.println("MortageRates Set -> " + mortgageRates);     // [1.1, 0.5, 2.0, 3.14, 4.1]
        System.out.println("Size of mortgageRates set -> " + mortgageRates.size());     // 5

        // to remove values
        // when using value with remove -> returns true if value is found and removed, else false
        System.out.println("is 1.1 removed -> " + mortgageRates.remove(1.1));
        System.out.println("is 1.0 removed -> " + mortgageRates.remove(1.0));

        System.out.println("MortageRates Set -> " + mortgageRates);     // [0.5, 2.0, 3.14, 4.1]
        System.out.println("Size of mortgageRates set -> " + mortgageRates.size());     // 4

        // to find if a particular value is present in Set/HashSet
        System.out.println("does 1.1 present in HashSet -> " + mortgageRates.contains(1.1));
        System.out.println("does 4.1 present in HashSet -> " + mortgageRates.contains(4.1));

        // to check if my HashSet is empty or not
        System.out.println("does mortgageRates empty? : " + mortgageRates.isEmpty());
        System.out.println("Length of mortgageRates list: " + mortgageRates.size());
        System.out.println("mortgageRates list: " + mortgageRates);

        // to empty your HashSet
        // mortgageRates.clear();

        System.out.println("does mortgageRates empty? : " + mortgageRates.isEmpty());
        System.out.println("Length of mortgageRates list: " + mortgageRates.size());
        System.out.println("mortgageRates list: " + mortgageRates);

        /**
         * Create a Set using List
         */
        List<Integer> alName = new ArrayList<>();
        alName.add(11);     // [11] -- size=1
        alName.add(22);     // [11, 22] -- size=2
        alName.add(11);     // [11, 22, 11] -- size=3
        alName.add(44);     // [11, 22, 11, 44] -- size=4
        alName.add(55);     // [11, 22, 11, 44, 55] -- size=5 (lastIndex=4)
        alName.add(66);     // [11, 22, 11, 44, 55, 66] -- size=6 (lastIndex=5)
        alName.add(22);
        alName.add(11);
        alName.add(44);
        alName.add(77);     // [11, 22, 11, 44, 55, 66, 22, 11, 44, 77]
                            // [11, 22, 44, 55, 66, 77]

        // [22, 11, 44, 55]
        // [11, 44, 22, 55]

        System.out.println("\n\nArrayList -> " + alName);

        Set<Integer> setUsingList = new HashSet<>(alName);

        System.out.println("Set -> " + setUsingList);

        if (alName.size() == setUsingList.size()) {
            System.out.println("No duplicates in list");
        } else {
            System.out.println("Duplicates in list");
        }

        /**
         * Create List using Set
         */
        List<Double> listUsingSet = new ArrayList<>(mortgageRates);
        System.out.println("Set -> " + mortgageRates);
        System.out.println("List -> " + listUsingSet);


    }
}
