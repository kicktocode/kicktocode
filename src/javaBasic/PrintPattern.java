package javaBasic;

public class PrintPattern {
    public static void main(String[] args) {
        for(int i=1;i<=3;i++)
        {
            System.out.print(" * ");// prints column wise
            for(int j=1;j<3;j++)
            {
                System.out.print(" 0 ");// prints row wise
            }
            System.out.println("\n");
        }

    }
}
