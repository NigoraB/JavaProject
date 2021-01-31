package Class10;

import java.util.*;

public class Map_HashMap {
    public static void main(String[] args) {

        /**
         * int abc = 10;
         * abc is storing value = 10
         *
         * int xyz = 980;
         * xyz is storing value = 980
         *
         * Map m1 = {(101 -> "happy"), (102 -> "peace"), (103 -> "joy"), (104 -> "happy")}
         * Map m1 = {(key1 -> val1), (key2 -> val2), (key3 -> val3), (key4 -> val4)}
         *
         * m1.key1 -> val1
         * m1.101 -> "happy"
         *
         * Syntax to create Hashmap/Map
         * HashMap<keyDatatypeClass, valueDatatypeClass> myHashMap = new HashMap<>();
         *      -- OR --
         * Map<keyDatatypeClass, valueDatatypeClass> myHashMap = new HashMap<>();
         *
         */

        Map<Integer,String> ssnData = new HashMap<>();
        System.out.println("ssnData -> " + ssnData);

        // to find the length (or size) OR to find the number of key-value pairs in HashMap
        System.out.println("Length of ssnData HashMap -> " + ssnData.size());   // 0

        // to add key-value pair in Map
        ssnData.put(101, "Happy".toLowerCase());
        ssnData.put(102, "peace".toLowerCase());
        ssnData.put(103, "joy".toLowerCase());
        ssnData.put(104, "Happy".toLowerCase());
        ssnData.put(102, "laugh".toLowerCase());
        ssnData.put(106, "peace".toLowerCase());

        System.out.println("\nssnData -> " + ssnData);
        System.out.println("Length of ssnData HashMap -> " + ssnData.size());   // 0

        // to remove values form Map
        // when key,value is used with remove ->
        //      if the key-value pair is found and removed it will return true, else false
        // when key is used with remove ->
        //      if the key is found and removed, it will return the removed value.
        //      else returns null
        System.out.println("\nis '103, joy' removed? : " + ssnData.remove(103, "joy"));   // true
        System.out.println("is 108 key removed? : " + ssnData.remove(108));         // null
        System.out.println("is 101 key removed? : " + ssnData.remove(101));         // Happy

        System.out.println("\nssnData -> " + ssnData);
        System.out.println("Length of ssnData HashMap -> " + ssnData.size());   // 3

        // to retrieve value associated with a key
        // if the key is found -> it will return the associated key
        // else null
        System.out.println("value associated with key-108: " + ssnData.get(108));
        System.out.println("value associated with key-102: " + ssnData.get(102));

        // to find if map contains a particular key or not
        // if given key is present -> it returns true, else false.
        System.out.println("does ssnData contain key-101? : " + ssnData.containsKey(101));  // false
        System.out.println("does ssnData contain key-104? : " + ssnData.containsKey(104));  // true

        // to find if map contains a particular value or not
        // if given value is present -> it returns true, else false.
        System.out.println("does value contain 'happy': " + ssnData.containsValue("happy".toLowerCase()));    // false
        System.out.println("does value contain 'Happy': " + ssnData.containsValue("Happy".toLowerCase()));    // true

        // to get all keys present in HashMap in a new variable -> set
        Set<Integer> allKeys = ssnData.keySet();    // [102, 104, 106]
        System.out.println("All keys from ssnData: " + allKeys);
        // print Hashmap like key = value
        for (Integer key : allKeys) {   // [102, 104, 106]
            System.out.println(key + " = " + ssnData.get(key));
        }
        /**
         * 102 = laugh
         * 104 = happy
         * 106 = peace
         */

        // to get all values present in HashMap in a new variable -> set
        Collection<String> allValues = ssnData.values();
        System.out.println("All values from ssnData: " + allValues);

        // to find if Map/HashMap is empty
        System.out.println("is ssnData map empty?: " + ssnData.isEmpty());  // false

        ssnData.clear();    // to empty hashmap

        System.out.println("is ssnData map empty?: " + ssnData.isEmpty());  // true

        /**
         * student count = 5
         * studentId -> grade
         *
         * int count = 5;
         * int[] ids = {1, 2, 3, 4, 5};
         * char[] grade = {'', '', '', '', ''};
         *
         * 1 -> 90, 98, 95, 80, 90
         * 2 -> 100, 98, 79, 88, 100
         *
         * {(id, char)}
         *
         * {(1, 'A'), }
         *
         * 101 -> ["", "", "", "", ""] name, addr, phone, creditScore, age
         *
         */

        Map<Integer, Character> grades = new HashMap<>();
        grades.put(1, 'A');
        grades.put(2, 'A');

        System.out.println(grades.get(1));


        Map<Integer, ArrayList<Object>> scores = new HashMap<>();






    }
}
