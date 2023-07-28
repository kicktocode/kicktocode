package javaBasic;

public class SumAvg {
    public static void main(String[] args)
    {
        int[] number={1,2,3,4,5};
        int sum=0;
        for(int i=0;i< number.length;i++)
        {
             sum=sum+number[i];
        }
        System.out.println("sum of given number is: " +sum);
        float avg=sum/ number.length;
        System.out.println("Average of given number is :" +avg);
    }
}
