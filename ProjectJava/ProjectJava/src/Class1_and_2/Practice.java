package Class1_and_2;

public class Practice {
    public static void main(String[] args) {
        /**
         * String sentence = "haPPpy nEw yeAR"; // VeRY gOOd MORNING
         * System.out.println("sentence value = " + sentence);     // haPPpy nEw yeAR (VeRY gOOd MORNING)
         *
         * // write code here
         *
         *
         * System.out.println("sentence value = " + sentence);     // Happy New Year (Very Good Morning)
         */

        /**
         * Ternary operator
         *
         * String fullName = "";
         * String isEnrolled =
         *      Assign "enrolled" if first-name length is greater than 7 or last-name starts with "A" (ignoring cases)
         *      else "try later"
         *
         * print the isEnrolled value.
         */
        String fullName = "Deepak Sharma";
        String firstname = fullName.split(" ")[0];
        int firstnameLength = firstname.length();
        boolean isfNameMoreThan7 = firstnameLength > 7;

        String lastname = fullName.split(" ")[1];
        boolean islNameStartsWith_A = lastname.toLowerCase().startsWith("a");   // SHARMA   A

        String isEnrolled = isfNameMoreThan7 || islNameStartsWith_A ? "enrolled" : "try later";

        System.out.println("isEnrolled = " + isEnrolled);


        /**
         * Ternary operator
         *
         * String threeWordString = "happy world have a great day";
         * Check if the string contains 3 words only (Yes / No)
         *    String result -> Assign 'Yes' if number of words in threeWordString variable are 3; else assign 'No'
         *    print the result.
         *
         */

        /**
         *
         * Create abbreviation (Assumption: string contains 3 words)
         *      "happy New year" -> HNY
         *      "lab SESSION Classes" -> LSC
         *      "good morning all" -> GMA
         *
         *      String input = "job prePAration ClasSes";
         *
         *      // code
         *
         *      JPC
         *
         */



        int number = 19;
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (number % 3 == 0) {
            System.out.println("Fizz");
        } else if (number % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(number);
        }

    }
}
