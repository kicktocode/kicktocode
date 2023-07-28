package javaBasic;

import java.util.Arrays;

public class ArrayUpperCase {
    public static void main(String[] args) {
        String[] arr={"Monday","Tuesday","wednesday","Thursday","Friday","Saturday"};
        System.out.println(" Original Array "+ Arrays.toString(arr));
        for(int i=0;i< arr.length;i++)
        {
            arr[i]=arr[i].toUpperCase();
        }
        System.out.println(" Modified Array "+ Arrays.toString(arr));
    }
}
