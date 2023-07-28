public class Reverse_Array {
    public static void main(String[] args) {
        int [] number={12,13,14,15,16,17};
        System.out.println("Array before reverse :");
        for(int i=0;i<number.length;i++) {
            System.out.print(number[i]+"  ");
        }
        System.out.println("\nArray after reverse :");
        for(int i=number.length-1;i>=0;i--)
        {
            System.out.print(number[i]+"  ");
        }
    }
}
