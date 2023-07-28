package javaBasic;

public class testSameDigit {
    public static void main(String[] args) {
        float n1=1234.2345f;
        float n2=1234.23f;
        String stringn1= String.valueOf(n1);
        String stringn2= String.valueOf(n2);
        if (stringn1.equals(stringn2))
        {
            System.out.println("both are equal");
        }
        else
        {
            System.out.println("both are not equal");
        }
    }
}
