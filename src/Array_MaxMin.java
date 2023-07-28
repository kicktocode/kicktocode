import java.lang.reflect.Array;
import java.util.*;
public class Array_MaxMin {
    public static void main(String[] args) {
        int []number={1,2,4,6,5,3,7,8,9};
        boolean Issorted=false;
        System.out.println("Array before sorting : ");
        for(int element:number){
            System.out.print(element +"  ");
        }
        Arrays.sort(number);
        System.out.println("\n");
        System.out.println("Array After sorting : ");
        for(int element:number){
            System.out.print(element +"  ");
        }


        System.out.println("\n");
        System.out.println("Min:"+number[0]);
        System.out.println("Max :"+number[number.length-1]);

    }
}
