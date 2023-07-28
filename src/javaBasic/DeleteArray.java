package javaBasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeleteArray {
    public static void main(String[] args) {
        int [] arr={4,5,6,7,8};
        System.out.print("Array before deletion of 2nd index value ");
        for(int j=0;j<=arr.length-1;j++)
        {
            System.out.print(arr[j]+" ");
        }
        int  removeIndex=0;
        System.out.println("\n");
        System.out.print("Array After deletion of 2nd index value " );
        for(int i=removeIndex;i<arr.length-1;i++)
        {
            arr[i]=arr[i+1];

        }
        System.out.println(Arrays.toString(arr));
    }
}
