package javaBasic;

public class Min2YearDay
{
    public static void main(String[] args)
    {

        int min = 3456789;
        int year = min/ 525600;
        int day = ((min % 525600) / 1440);
        System.out.println("Year: "+year+"\nDay: "+day);
    }
}