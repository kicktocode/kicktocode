import java.util.Scanner;

public class sumInt {
    public static void main(String [] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number to sum : ");
        String num= scanner.nextLine();
        System.out.println("sum of entered number is : "+ sumNum(num));
    }
    public static int sumNum(String num)
    {
        int sum=0;
        for(int i=0;i<num.length();i++)
        {
          sum=sum+num.charAt(i)-48;
        }
        return sum;
    }
}
