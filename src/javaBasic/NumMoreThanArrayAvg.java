package javaBasic;

import java.util.Arrays;

public class NumMoreThanArrayAvg {
    public static void main(String[] args) {
        int[] ar = {4, 6, 7, 8, 9, 10};
        int sum = 0;
        System.out.println("Array is : "+ Arrays.toString(ar));
        for (int i = 0; i < ar.length; i++) {
            sum = ar[i] + sum;

        }
        System.out.println("Sum of elements of array :" + sum);
        int avg = sum / ar.length;
        System.out.println("Average of elements of array :" + avg);
        System.out.println("Elements more than avg are : ");
        for (int j = 0; j < ar.length; j++)
        {
          if(ar[j]>avg)
          {
              System.out.print(ar[j]+" ");
          }
        }
    }
}