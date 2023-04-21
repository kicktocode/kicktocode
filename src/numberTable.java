import java.util.Scanner;

public class numberTable {
    public static void main(String[] args) {
        System.out.println("enter number of table to print : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sc);
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "x" + i + "=" + (i * n));
        }
    }
}
