package trycatch;

import java.util.Scanner;

public class NumberFormatExceptionHandling extends Throwable {
    public static void main(String[] args) {
        System.out.println("enter number ");
        Scanner scanner= new Scanner(System.in);
        String number= scanner.nextLine();
        try{
            int num=Integer.parseInt(number);
            System.out.println("input number provided :" + number);
        }
        catch (NumberFormatException e){
            System.out.println("throwing error ,please provide valid number "+ e);

        }
    }
}
