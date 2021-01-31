package Class8.Interface_AbstractClass;

public class MyClass extends AbstractClass implements InterfaceTheory,InterfaceTheory2 {

    public void myClassSaysHello() {
        System.out.println("Hello from MyClass");
    }


    @Override
    public void sayHello() {
        System.out.println("** Hello Dear **");
    }

    @Override
    public void greetings(String username) {
        System.out.println("Hello to " + username);
    }

    @Override
    public int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    @Override
    public int findMax(int[] arr, int num) {
        return 0;
    }

    @Override
    public void sayHello2() {

    }

    @Override
    public void greetings2(String username) {

    }

    @Override
    public int findMax2(int[] arr) {
        return 0;
    }

    @Override
    public int findMax2(int[] arr, int num) {
        return 0;
    }

    @Override
    public void firstAbstractMethod() {

    }

    @Override
    public int secondAbstractMethod() {
        return 0;
    }
}
