package javaBasic;

public class CountInput {
    public static void main(String[] args)
    {
    int i;
    int count=0;
    int[] arr={13,2,43,4,5,16,56,89,7,3};
    for(i=0;i<arr.length;i++)
    {
        count=count+1;
    }
        System.out.println("length of entered number is "+count);
    }
}
