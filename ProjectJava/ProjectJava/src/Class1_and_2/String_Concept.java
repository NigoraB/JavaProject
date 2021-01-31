package Class1_and_2;

import java.util.Arrays;

public class String_Concept {
    public static void main(String[] args) {

        String cityname = "New York";

        // length - gives use the length of String
        // input parameter - 0
        // return type - int
        // will it change the original value - no
        int cityNameLength = cityname.length();
        System.out.println("Cityname length - " + cityNameLength);
        System.out.println("City name - " + cityname);


        // toLowerCase - to convert string value in all lowercase
        // input parameter - 0
        // return type - String
        // will it change the original value - no
        String citynameInLowercase = cityname.toLowerCase();
        // cityname = cityname.toLowerCase();
        System.out.println("\ncity name in lowercase - " + citynameInLowercase);
        System.out.println("City name - " + cityname);

        // toUpperCase - to convert string value in all uppercase
        // input parameter - 0
        // return type - String
        // will it change the original value - no
        String citynameInUppercase = cityname.toUpperCase();
        System.out.println("\ncity name in uppercase - " + citynameInUppercase);
        System.out.println("City name - " + cityname);

        // compare two string (equals or equalsIgnoreCase)
        // equals - checks for value and cases (lower/upper)
        // equalsIgnoreCase - checks for value

        // equals
        // input parameter - 1 (String)
        // return type - boolean
        // will it change the original value - no
        boolean isCityNameNEWYORK = cityname.equals("NEW YORK");
        System.out.println("\nis City name NEW YORK - " + isCityNameNEWYORK);

        // equalsIgnoreCase
        // input parameter - 1 (String)
        // return type - boolean
        // will it change the original value - no
        boolean isCityNameNewYork_noCases = cityname.equalsIgnoreCase("NEW YORK");
        System.out.println("is City name NEW YORK ignoring cases - " + isCityNameNewYork_noCases);

        // contains - to check if String-value contain given string or not
        // input parameter - 1 (CharSequence/String)
        // return type - boolean
        // will it change the original value - no
        boolean isCityNameContains_new = cityname.contains("new");
        System.out.println("\nis city name contain new - " + isCityNameContains_new);
        // -- OR --
        System.out.println(cityname.toLowerCase().contains("new"));

        // replace - to replace a single or more characters in a String
        String cityname_AfterReplace = cityname.replace('k' , 'Z');
        System.out.println("\nCity name after replace - " + cityname_AfterReplace);    // New YorZ
        System.out.println("City name - " + cityname);  // New York

        String cityname_AfterReplace1 = cityname.replace("w Y", "w York City");
        System.out.println("\nCity name after replace - " + cityname_AfterReplace1);    // New York Cityork
        System.out.println("City name - " + cityname);  // New York

        /**
         * "New York1"
         * N    -   index-0
         * e    -   index-1
         * w    -   index-2
         *      -   index-3
         * Y    -   index-4
         * o    -   index-5
         * r    -   index-6
         * k    -   index-7     (last index)
         * 1    -   index-8
         *
         * Length = 8
         *
         * lastIndex = length-1
         *
         */

        // indexOf
        // charAt
        // lastIndexOf
        // starts-with
        // ends-with
        // trim
        // split
        // substring

        // cityname = "New Yowk ws new city"
        // indexOf -> if the given string found, returns the index of first occurrence of given string; else returns -1
        // input parameter - 1 (String)
        // return type - int
        // will it change the original value - no
        int indexOfz = cityname.indexOf("z");
        System.out.println("\nIndex of z in '" + cityname + "': " + indexOfz);

        int indexOfRandom = cityname.indexOf("w Yo");
        System.out.println("Index of 'w Yo' in '" + cityname + "': " + indexOfRandom);

        // charAt -> if the given index found, returns the character present at the index; else returns StringIndexOutOfBoundsException
        // input parameter - 1 (int)
        // return type - char
        // will it change the original value - no
        // char charAt99 = cityname.charAt(99);
        // System.out.println("Character present at index-99 in '" + cityname + "' is: " + charAt99);

        char charAt2 = cityname.charAt(2);
        System.out.println("Character present at index-2 in '" + cityname + "' is: " + charAt2);


        // lastIndexOf -> if the given string found, returns the index of last occurrence of given string; else returns -1
        // input parameter - 1 (String)
        // return type - int
        // will it change the original value - no
        String inputString = "New York was a city with new constructions";
        int lastIndexOf_new = inputString.toLowerCase().lastIndexOf("w");
        int indexOf_new = inputString.toLowerCase().indexOf("w");
        System.out.println("Last index of 'new' in '" + inputString + "': " + lastIndexOf_new);
        System.out.println("Index of 'new' in '" + inputString + "': " + indexOf_new);

        // starts-with -> checks if string starts with the given string
        // input parameter - 1 (String)
        // return type - boolean
        // will it change the original value - no
        boolean isStartsWith_new = cityname.startsWith("new");    // New York
        System.out.println("Is '" + cityname + "' start with 'new': " + isStartsWith_new);

        // ends-with -> checks if string ends with the given string
        // input parameter - 1 (String)
        // return type - boolean
        // will it change the original value - no
        boolean isEndsWith_ork = cityname.endsWith("ork");
        System.out.println("Is '" + cityname + "' end with 'ork': " + isEndsWith_ork);

        // trim -> it will removes the extra spaces from the beginning and end of the String;
        // it will not remove extra spaces in-between the string
        // input parameter - 0
        // return type - String
        // will it change the original value - no
        String inputStr = "      .Happy    world.       .";
        String inputStr_trim = inputStr.trim();
        System.out.println("Original String:" + inputStr);
        System.out.println("After trim: " + inputStr_trim);

        // split -> splits the string from given string points
        // input parameter - 1 (String)
        // return type - String[]
        // will it change the original value - no
        String inputForSplit = "Happy world, have a great day";
        String[] afterSplit_Space = inputForSplit.split(" ");
        System.out.println(Arrays.toString(afterSplit_Space));

        String[] afterSplit_a = inputForSplit.split("a");
        System.out.println(Arrays.toString(afterSplit_a));

        String[] afterSplit_nothing = inputForSplit.split("");
        System.out.println(Arrays.toString(afterSplit_nothing));
        System.out.println(afterSplit_nothing);

        // subString -> it returns a portion of your String from beginIndex to endIndex
        // input parameter - 2 or 1 (int)
        //      when endIndex is present, subString will NOT include it in the result
        //      when endIndex is NOT present, subString will give from beginIndex to end.
        // return type - String
        // will it change the original value - no
        String inputForSubString = "Happy world, have a great day";
        String valueFrom0to3 = inputForSubString.substring(0,3);    // subString does not include the end-index
        System.out.println("Substring from 0 to 3: " + valueFrom0to3);

        String valueFrom3 = inputForSubString.substring(3);    // no end-Index, hence from  index-3 to end
        System.out.println("Substring from 3: " + valueFrom3);






    }
}
