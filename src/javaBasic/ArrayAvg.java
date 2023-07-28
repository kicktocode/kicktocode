package javaBasic;

public class ArrayAvg {
    public static void main(String[] args) {
        int[] arr1={1,3,5,6};
        int sum=0;
        for(int i=0;i<arr1.length;i++)
        {
            sum=sum+arr1[i];
        }
        float avg=sum/arr1.length;
        System.out.println("Average of given array is :" +avg );
    }
}
