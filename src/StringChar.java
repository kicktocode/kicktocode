import java.security.SecureRandom;
import java.util.Scanner;
public class StringChar {
    public static void main (String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number ");
        String num= scanner.nextLine();
        num.length();
        System.out.println("length of number entered is:" + num.length());
        System.out.println("value of middle term is:" + num.charAt((num.length())/2));

    }
}
