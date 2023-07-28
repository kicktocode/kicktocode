package javaBasic;

public class GreatestOfThree {
    public static void main(String[] args)
    {
        int[] number={1,102,56};
        int greatest= number[0];
        for(int i=1;i<number.length;i++)
        {
            if(number[i]>greatest)
            {
               greatest= number[i];
            }
        }
        System.out.println(greatest);


    }
}
