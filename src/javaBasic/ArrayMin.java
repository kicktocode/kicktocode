package javaBasic;

public class ArrayMin {
    public static void main(String[] args) {
        int[] arr = {2, 6, 7, 8, 9, 1};
        int min=arr[0];
        for (int i =0;i<=arr.length-1;i++)
        {
           if(arr[i]<min)
           {
              min=arr[i];
           }
        }
        System.out.println(min);
    }
}