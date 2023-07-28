package javaBasic;

import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {
        int[] ar = {1, 0, 2, 3, 0, 4};
        System.out.println("Array before sorting : " + Arrays.toString(ar));

        MoveZeroRight(ar);
        System.out.println("Arrays After sorting: " + Arrays.toString(ar));
    }

    public static void MoveZeroRight(int ar[])
    {
        int writePointer = 0;
        for (int i = 0; i < ar.length; i++)
        {
            if (ar[i] != 0)
            {
                int temp = ar[i];
                ar[i] = ar[writePointer];
                ar[writePointer] = temp;
                writePointer++;
            }
        }
    }
}