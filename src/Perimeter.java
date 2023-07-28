import java.io.*;
public class Perimeter {
    int length;
    int breadth;

    Perimeter(int length, int breadth){
        this.breadth= breadth;
        this.length=length;
    }
    public void getPerimeter(){
        int perimeter= 2*(length+breadth);
        System.out.println("perimeter :" + perimeter);
    }
}
 class Main{
    public static void main(String [] args){
        Perimeter rectangle= new Perimeter(20,4);
        rectangle.getPerimeter();
    }
}