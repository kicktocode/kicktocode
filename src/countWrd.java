import java.util.Scanner;

public class countWrd {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter sentence : ");
        String wrd=scanner.nextLine();
        System.out.println("word count of sentence is :"+ count(wrd));

    }

    public static int count(String wrd)
    {
        int count=0;
        for(int i=0;i<wrd.length();i++)
        {
            count++;
        }
        return count;
    }
}
