import java.util.Scanner;

public class Formula {
    public static void main(String[] args) {
        double sum=((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
        System.out.println(sum);
        double sum1=(4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));
        System.out.println(sum1);
        // Perimeter of circle
        double pi= Math.PI;
        float radius=7.5F;
        System.out.println("area of circle is :"+ pi*radius*radius);
        System.out.println("perimeter of circle is :"+ 2*pi*radius);

       //take three input and print avg
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter first number ");
        int num1= scanner.nextInt();

        System.out.println("enter second number ");
        int num2= scanner.nextInt();

        System.out.println("enter third number ");
        int num3= scanner.nextInt();

        float avg= (num1+num2+num3)/3;
        System.out.println("average value of entered number is "+avg);

        //area and perimetr of rectangle
        float w=5.5f;
        float h=8.5f;
        System.out.println("Area is 5.5*8.5 = "+5.5*8.5);
        System.out.println("Perimeter is 2*(5.5+8.5) = "+2*(5.5+8.5));



    }
}
