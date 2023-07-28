import java.util.*;
public class LinkedlistPrac {
    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<>();
        LinkedList<Integer> l2=new LinkedList<>();
        l1.add(52);
        l1.add(50);
        l1.add(2,55);
        l1.addFirst(48);
        l1.addLast(25);
        System.out.println("Printing l1" + l1);
        l2 =(LinkedList<Integer>) l1.clone();
        System.out.println("Printing l2" + l2);
        System.out.println(l1.contains(50));
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println("List : " + list);
        Iterator<Integer> descItr = list.descendingIterator();
        System.out.println("Has NExt : " + descItr.hasNext());
        System.out.print("List : ");
        while(descItr.hasNext()) {
            System.out.print(descItr.next() + ", ");
        }
        System.out.println();
//        System.out.println(l1.descendingIterator());
        System.out.println(l1.element());
        System.out.println(l1.get(2));
        System.out.println( l1.indexOf(48));
        System.out.println( l1.isEmpty());
        System.out.println( l1.toArray());
        System.out.println( l1.size());
        System.out.println( l1.set(0,25));
        System.out.println( l1.removeLast());

    }
}
