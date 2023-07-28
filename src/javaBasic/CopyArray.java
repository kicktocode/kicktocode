package javaBasic;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] arr={4,6,7,8,2};
        int []temp=new int[5];
        for(int i=0;i<arr.length;i++)
        {
            temp[i]=arr[i];

        }
        System.out.println(Arrays.toString(temp));
    }
}
