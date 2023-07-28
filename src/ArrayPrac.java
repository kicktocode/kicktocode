import java.util.ArrayList;

public class ArrayPrac {
    public static void main(String[] args) {
        ArrayList <Integer> l1=new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.set(0,5);
        System.out.println(l1);
        l1.add(0,6);
        l1.add(7);
        System.out.println(l1);
    }
}
