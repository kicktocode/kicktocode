package javaBasic;

import java.util.Arrays;

public class IncrementArrayElement {
    public static void main(String[] args) {
        int [] arr1={1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr1));
        for(int i=0;i< arr1.length;i++)
        {
            arr1[i]=arr1[i]+1;
        }
        System.out.println(Arrays.toString(arr1));
    }
}
