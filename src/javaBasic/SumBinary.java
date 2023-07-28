package javaBasic;

public class SumBinary {
    public static void main(String[] args) {
        String s1 = "100";
        String s2 = "111";
        int x = Integer.parseInt(s1, 2);
        int y = Integer.parseInt(s2, 2);
        int result = x + y;
        String s3 = Integer.toBinaryString(result);
        System.out.println(s1 + "+" + s2 + "=" + s3);
    }
}
