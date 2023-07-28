package javaBasic;

public class SumDigit {
    public int sum(int n)
    {
        int sum1 = 0;
        if (n >= 0 && n <= 1000)
        {
            while (n != 0)
            {
                sum1 = sum1 + n % 10;
                n = n / 10;
            }
        }
        return sum1;
    }
        public static void main(String[] args) {
            SumDigit obj=new SumDigit();
            obj.sum(12);
            System.out.println("Sum of entered number is : "+obj.sum(12));
        }
    }

