import java.util.Scanner;

public class CountVowel
{
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter sentence");
        String str = scanner.nextLine();
        System.out.println("Number of vowels in string is: " + strcount(str));
    }

    public static int strcount(String str) {
        int count = 0;
        for (int i = 0; i <str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;

            }

        }
        return count;
    }
 }