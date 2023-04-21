import java.util.Scanner;
public class Min {
        public static void main (String[] args){
             int num1=5;
             int num2=10;
             int num3=15;
             Math.min(num1,num2);
             if(Math.min(num1,num2)>num3)
             {
                     System.out.println("smallest among three is"+ num3);
             }
             else {
                     System.out.println("smallest among three is " + Math.min(num1,num2));
             }

        }
}