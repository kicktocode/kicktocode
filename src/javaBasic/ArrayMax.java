package javaBasic;

import javax.naming.PartialResultException;

public class ArrayMax {
    public static void main(String[] args) {
        int[] arr={6,9,10,12,8};
        int max=arr[0];
        for(int i=0;i<=arr.length-1;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }

        }
        System.out.println(max);
    }
}
