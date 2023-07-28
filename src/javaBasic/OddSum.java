package javaBasic;

public class OddSum {
    public static void main(String[] args) {
        int i=0;
        int sum=0;
        for(i=0;i<=20;i++)
        {
            if(i%2!=0)
            {
                sum=sum+i;
            }
        }
        System.out.println("sum of odd number till 20 is:"+sum);
    }
}
