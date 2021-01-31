package Class7.Inheritance;

public class MyMethods extends BaseMethods {

    int cNum = 20;
    String cStr = "Child";

    public boolean verifyStringIdentical(int num, String str1, String str2) {
        super.addNums(1,2);
        addNums(1,2);
        return super.isStringIdentical(str1, str2);
    }

    public boolean isStringIdentical(String s1, String s2) {
        System.out.println("In My Methods isStringIdentical");
        return (s1.equalsIgnoreCase(s2));
    }



}
