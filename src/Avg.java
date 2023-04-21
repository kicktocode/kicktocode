import java.util.Scanner;
public class Avg {
    public static void main(String[] args){
        Scanner num= new Scanner(System.in);

        System.out.println("enter first number ");
        int num1 = num.nextInt();
        System.out.println("enter second number ");
        int num2 = num.nextInt();
        System.out.println("enter third number ");
        int num3 = num.nextInt();
        int avg=(num1+num2+num3)/3;
        System.out.println("Avg is :" + avg);
    }
}
