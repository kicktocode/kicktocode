package javaBasic;

import java.util.Arrays;

public class InsertElementArray {
    public static void main(String[] args) {
        int [] arr={1,2,4,5};
        System.out.println("Arrays before element insertion " + Arrays.toString(arr));
        int[] newArray=new int[arr.length+1];
        int index=2;
        int element =3;
        System.out.println("Array after insertion of element : ");
        for(int i=0;i< arr.length;i++)
        {
            newArray[i]=arr[i];
        }
        newArray[2]=3;
        for(int j= newArray.length;j<=2;j--)
        {
            System.out.print(newArray[j]+" ");
        }

    }
}
