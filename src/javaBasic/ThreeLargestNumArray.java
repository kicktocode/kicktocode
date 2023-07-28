package javaBasic;

import java.util.Arrays;

public class ThreeLargestNumArray {
    public static void main(String[] args) {
        int []ar={2,6,7,8,9,4,10};
        System.out.println("Origional array :"+ Arrays.toString(ar));
       Arrays.sort(ar);
       for(int i=ar.length-1;i>=ar.length-3;i--)
       {
           System.out.print(ar[i]+" ");
       }

    }
}



