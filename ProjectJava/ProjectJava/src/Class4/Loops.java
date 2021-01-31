package Class4;

public class Loops {
    public static void main(String[] args) {
        /**
         * Loops
         * 1. for
         * 2. while
         * 3. do-while
         * 4. Enhanced for-loop (foreach loop or Advanced Loop)
         */

        /**
            Syntax:

            for (Initialization ; Condition ; Increment) {
                // code
            }

            for (Initialization ; Condition ; ) {
                // code
                Increment
            }

            Initialization
            for ( ; Condition ; ) {
                // code
                Increment
            }
         */


            for ( int i=0; i<5 ; ) {
                System.out.println(i);
                //
                //
                //
                i++;
            }

            /**
                i=0
                   i<5 - true
                        0
                i=1
                    i<5 - true
                        1
                i=2
                    i<5 - true
                        2
                i=3
                    i<5 - true
                        3
                i=4
                    i<5 - true
                        4
                i=5
                    i<5 - false
             */


        // print from 5 to 1

        System.out.println(5);
        System.out.println(4);
        System.out.println(3);
        System.out.println(2);
        System.out.println(1);

        for (int i=5 ; i>0 ; ) {
            System.out.println(i);
            i--;
        }

        // from numbers 1 to 10; print numbers which are divisible by 5
        // %
        for (int i=1 ; i<=10 ; i++) {
            if (i%5==0) {
                System.out.println(i);
            }
        }
        // 1%5 -> 1
        // 1/5 -> 0

        // 10%3 -> 1
        // 10/3 -> 3

        // 22%5 -> 2
        // 20%5 -> 0

        int[] numbers = {11, 22, 33};

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);


        for (int i=1 ; i<numbers.length ; i+=2) {
            System.out.println(numbers[i]);
        }

        // i++ -> i = i+1
        // i+=2 -> i = i+2
        // i*=5 -> i = i*5
        /**
         * Enhanced for Loop
         *
         * Getting used with Array or similar datatype
         * and, you want to move from index-0 to last-index, one-by-one
         */
        for (int num : numbers) {
            System.out.println(num);
        }

        String[] names = {"happy", "peace", "joy", "learn"};

        for (String name : names) {
            System.out.println(name);
        }


        /**
         * while
            Syntax:

                while (condition) {
                    // code

                    // increment/decrement;
                }
         */
        // print numbers from 1 to 5
        /*
        i=1
        i++
        i<=5
         */
        int j=1;
        while (j<=5) {
            System.out.println(j);
            j++;
        }

        // For numbers 1 to 10
        // print the number, and in next line, print if it is odd or even

        // num=1
        // num%2==1 --> odd
        /*
        i=1
        i++
        i<=10
         */
        int j1 = 1;
        while (j1<=10) {    // 11<=10
            System.out.println("Number = " + j1);
            if (j1%2==1) {
                System.out.println("Odd");
            } else {
                System.out.println("Even");
            }
            j1++;
        }

        /**
         * do-while loop
            Syntax:
            do {
                // code
            } while (condition);    // condition is going to be checked from 2nd execution
         */

        int j2 = 11;
        do {    // 11<=10
            System.out.println("Number = " + j2);
            if (j2%2==1) {
                System.out.println("Odd");
            } else {
                System.out.println("Even");
            }
            j2++;
        } while (j2<=10);



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
