package Class4;

public class Increment {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(a++);    // 5 (a=6) [use the current value of variable, then increment behind the scenes]
        System.out.println(++a);    // 7 (a=7) [increment the value, then use it for whatever purpose]
        System.out.println(a);      // 7

        int b = a++;    // 7 (a=8, b=7)
        int c = ++a;    // 9 (a=9 , b=7, c=9)

        System.out.println(a); // 9
        System.out.println(b); // 7
        System.out.println(c); // 9
    }
}
