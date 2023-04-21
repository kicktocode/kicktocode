import java.util.SimpleTimeZone;

public class InterestRate {
    public static void main(String[] args)
    {
        int year=5;
        int princi=1000;
        int interest=10;

        SIcount(year,princi,interest);
    }

    public static double SIcount(int year,int princi,int interest)
    {
        double SI=((year*princi*interest)/100);
        double sum=0;
        for(int i=0;i<=5;i++)
        {
            sum=sum+SI;
            System.out.println("Simple interest for"+ i +"year is:" + sum);
        }

        return sum;



    }
}
