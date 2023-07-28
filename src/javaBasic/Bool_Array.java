package javaBasic;

public class Bool_Array {
    public static void main(String[] args) {
        boolean [] arr={true,false,true,false,false};
        System.out.println("Array before manipulation :");
        for(int j =0;j<=arr.length-1;j++)
        {
            System.out.print(arr[j] +" ");
        }
        System.out.println("\n");
        System.out.println("Array after manipulation :");

        for(int i=0;i<=arr.length-1;i++)
        {
            if(arr[i])
            {
                System.out.print("t"+" ");
            }
            else
            {
                System.out.print("f"+" ");
            }

        }
    }
}
