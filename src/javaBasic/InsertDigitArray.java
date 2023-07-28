package javaBasic;

public class InsertDigitArray {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5,6};
        System.out.println("Array before insertion of number at 4th position : ");
        for(int i=0;i<numbers.length;i++)
        {
            System.out.print(numbers[i]+"  ");
        }
        numbers[4]=89;

        System.out.println("\n Array after insertion of number at 4th position : ");
        for(int i=0;i<numbers.length;i++)
        {
            System.out.print(numbers[i]+"  ");
        }

    }
}
