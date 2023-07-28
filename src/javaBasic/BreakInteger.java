package javaBasic;

import java.util.Scanner;

public class BreakInteger {
    public static void main(String[] args)
    {
        int number=2567894;
        String stringNum=String.valueOf(number);
        for(int i =0;i<stringNum.length();i++)
        {

            System.out.print( stringNum.charAt(i)  + "  ") ;

        }

    }
}
