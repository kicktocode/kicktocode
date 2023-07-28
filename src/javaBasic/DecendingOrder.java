package javaBasic;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DecendingOrder {
    public static void main(String[] args) {
        int[] num = {4, 5, 6, 3, 2, 9};
        System.out.println("Initial array order :");
        for (int j = 0; j <= num.length - 1; j++) {
            System.out.print(num[j] + " ");
        }
        System.out.println("\n");

        Arrays.sort(num);
        System.out.println("Array in decending order :");
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.print(num[i] + " ");
        }
    }
}
