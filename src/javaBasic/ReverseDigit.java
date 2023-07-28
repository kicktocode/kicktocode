package javaBasic;

public class ReverseDigit {
    public static void main(String[] args) {
        String[] letters={"A","B","C"};
        System.out.println("Arrangement before change ");
        for(int i=0;i<= letters.length-1;i++)
        {
            System.out.print(letters[i]+" ");
        }
        System.out.println("\n");
        System.out.println("Arrangement after change ");
        for(int j= letters.length-1;j>= 0;j--)
        {
            System.out.print(letters[j]+" ");
        }

    }
}
