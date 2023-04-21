import java.util.Scanner;
public class arithmatic {
    public static void main(String[] args)
    {
        System.out.println("enter first number");
        Scanner num = new Scanner(System.in);
        int  num1= num.nextInt();
        System.out.println("enter second number");
        int  num2= num.nextInt();
        System.out.println("sum of number is :"+ (num1+num2));
        System.out.println("subtraction of number is :"+  (num1-num2));
        System.out.println("multiplication of number is :"+ (num1*num2));
        System.out.println("division of number is :"+  (num1/num2));
        System.out.println("modulo of number is :"+  (num1%num2));

    }
}
