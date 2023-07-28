package javaBasic;

public class CubeNumber {
    public static void main(String[] args)
    {
        int i;
        int cube=0;
        for (i=1;i<=10;i++)
        {
            cube=i*i*i;
            System.out.println("cube of given number"+" "+i+" "+"is :"+cube);
        }
    }
}
