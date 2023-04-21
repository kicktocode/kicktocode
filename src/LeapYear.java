import javax.swing.*;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter year to check leap year : ");
        int year = scanner.nextInt();
        System.out.println(LeapCheck(year));
    }
    public static  int LeapCheck(int y)
    {
      if(y/4==0 && y/100!=0 || y/400==0 )

      {
          System.out.println("leap year");
          return 1;

      } else
      {
          System.out.println("non leap year");
          return 0;

      }


    }
}
