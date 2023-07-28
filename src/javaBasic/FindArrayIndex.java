package javaBasic;

public class FindArrayIndex {
    public static void main(String[] args) {
        int arr3[]={45,56,89,78};

        for(int i =0;i<arr3.length;i++)
        {
            if(arr3[i]==56)
            {
                System.out.println("Index of 56 in given array is " +i);

            }
        }
    }
}
