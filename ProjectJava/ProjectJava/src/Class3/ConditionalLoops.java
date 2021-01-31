package Class3;

public class ConditionalLoops {
    public static void main(String[] args) {

        /**
         * Conditional Blocks
         *
         * 1. if-else
         * 2. if-else if-else
         * 3. switch
         */

        /**
         * Syntax:
         *
         * if (<condition>) {
         *      // code
         * }
         *
         * if-else
         *
         * if (<condition>) {
         *      // code
         * } else {
         *      // code
         * }
         *
         * if (<condition>) {
         *     // code
         * } else if (<condition>) {
         *     // code
         * } else if (<condition>) {
         *     // code
         * } else {
         *     // code
         * }
         *
         * if weekday
         *      if meeting
         *              wear suit
         *      if no friday
         *              wear formals
         *      else
         *              wear casual
         * if !weekday
         *      wear payjama
         */
        /**
        if (weekday) {
            if (meeting == true) {
                System.out.println("suits");
            } else if (day != "friday") {
                System.out.println("formal");
            } else {
                System.out.println("casuals");
            }
        } else {
            System.out.println("Payjama");
        }

        if (classToday) {
            System.out.println("wake up early");
        } else {
            System.out.println("sleep");
        }
        **/
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

        if (isfNameMoreThan7 || islNameStartsWith_A) {
            isEnrolled = "Enrolled";
        } else {
            isEnrolled = "try again";
        }


        String name = "Happy";
        boolean result = false;
        int var1 = 10;

        if (name.length()>10 && var1 <= 5) {
            System.out.println(name.toUpperCase());
        } else {
            System.out.println(name.toLowerCase());
        }

        String day = "weekday";
        String dayName = "tuesday";
        boolean anyMeetings = true;
        String clothes = "";

        if (day.equalsIgnoreCase("weekday")) {
            if (anyMeetings) {
                clothes = "suits";
            } else if (!dayName.equalsIgnoreCase("friday")) {
                clothes = "formal";
            } else {
                clothes = "business casual";
            }
        } else {
            clothes = "payjama";
        }

        System.out.println("Clothes to wear -> " + clothes);


        /**
         * switch
         *
         * Syntax
         *
         * switch (<variableName>) {
         *
         *  case <value1>:
         *      // code1
         *      // code2
         *      break;
         *  case <value2>:
         *      // code1
         *      // code2
         *      break;
         *  case <value3>:
         *      // code1
         *      // code2
         *      break;
         *  default:
         *      //code
         * }
         */

        // mon-fri -> go to office
        // sat -> go to shopping
        // sun -> go to bed
        String myDay = "Wodnesday";
        switch (myDay.toLowerCase().substring(0,3)) {   // wod
            case "mon":
            case "tue":
            case "wed":
            case "thu":
            case "fri":
                System.out.println("Go to office");
                break;
            case "sat":
                System.out.println("Go to shopping");
                break;
            case "sun":
                System.out.println("Go to bed");
                break;
            default:
                System.out.println("Wrong name entered - " + myDay);
        }




    }
}
