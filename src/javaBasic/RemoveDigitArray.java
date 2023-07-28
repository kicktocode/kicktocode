package javaBasic;

import java.util.Arrays;

public class RemoveDigitArray {
    public static void main(String[] args)
    {
     int[] array={7,8,5,3,9,6,5,1};

        System.out.println("Array before removing 0th digit i.e. 7 :" +"\n"+ Arrays.toString(array));
        System.out.println("Arrays after removing 0th digit i.e. 7 :");
        int removeIndex=3;
        for(int i=removeIndex;i< array.length-1;i++)
        {
            array[i]=array[i+1];

        }
        System.out.print(Arrays.toString(array));



    }
}
