package javaBasic;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] ar={1,2,3,4,5,6,7,8,9};
        int []temp=ar;
        for(int i=0;i<temp.length;i++)
        {
            System.out.print(temp[i]+" ");
        }
    }
}
