package javaBasic;

import java.util.ArrayList;

public class DeleteArraylist__wrongCode {
    public static void main(String[] args) {
        ArrayList<Integer>ar=new ArrayList<Integer>();
        for(int i=0;i<5;i++ )
        {
            ar.add(i);
            System.out.println(ar);
            ar.remove(1);
            System.out.println(ar);
        }
        for(int i=0;i<ar.size();i++)
        {
            System.out.print(ar.get(i)+" ");
        }
    }

}
