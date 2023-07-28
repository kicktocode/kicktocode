package javaBasic;

import java.util.Arrays;

public class AcendingOrder {
    public static void main(String[] args) {
        int[] array={1,5,26,3,8,7};
        System.out.println("Array before sorting");

        for(int j=0;j<=array.length-1;j++)
        {
            System.out.print(array[j] +"  ");
        }


        Arrays.sort(array);
        System.out.println("\n");
        System.out.println("Array after sorting in acending order :");

        for(int i=0;i<= array.length-1;i++)
        {
                 System.out.print(array[i]+"  ");

        }
    }
}
