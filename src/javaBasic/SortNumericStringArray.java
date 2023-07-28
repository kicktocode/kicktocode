package javaBasic;

import java.util.Arrays;

public class SortNumericStringArray {
    public static void main(String[] args) {
        int[] arr={4,5,7,8,6,3,45,86,95};
        String[] arr2={"Dolzo","Antomy","Noha","Zen","Tom","Zucker"};
        System.out.println("Integer array before sorting :" + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Integer array After sorting :" + Arrays.toString(arr));
        System.out.println("String array before sorting :" + Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println("String array After sorting :" + Arrays.toString(arr2));
    }
}
