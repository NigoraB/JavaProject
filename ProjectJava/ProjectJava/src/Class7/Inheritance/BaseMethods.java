package Class7.Inheritance;

public class BaseMethods {

    int bNum = 10;
    String bStr = "Parent";

    public boolean isStringIdentical(String s1, String s2) {
        System.out.println("In Base Methods isStringIdentical");
        return (s1.equals(s2));
    }

    public int addNums(int a, int b) {
        return (a+b);
    }

    public double addNums(double a, int b) {
        return (a+b);
    }


    public double addNums(int a, double b) {
        return (a+b);
    }

    public int addNums(int a, int b, int c) {
        return (a+b+c);
    }

    public int findMaxInIntArray(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }


}
