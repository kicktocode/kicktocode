public class Rectangle {
    int length;
    int height;
    Rectangle( int length, int height){
        this.height=height;
        this.length=length;

    }

    public int setHeight(int height) {
        this.height = height;
        return height;
    }

    public int getheigth(int height){
        return height;
    }
    public int setLength(int length){
        this.length=length;
        return length;
    }
    public int getLength(int length){
        return length;
    }
    public int setArea(int length,int height){
        int Area=length*height;
        return Area;
    }

    public int getArea(){
        int Area=length*height;
        return Area;

    }
    public int setPerimeter(int length,int height){
        int perimeter=2*(length+height);
        return perimeter;

    }

    public int getPerimeter(){
        int perimeter=2*(length+height);
        return perimeter;
    }
}
class RectangleDet{
    public static void main(String []args){
        Rectangle obj=new Rectangle(20,20);
        Rectangle obj1=new Rectangle(40,20);

        System.out.println("area of rectangle " + obj.getArea());
        System.out.println("area of rectangle " + obj1.getArea());
        System.out.println("Perimeter of rectangle " + obj.getPerimeter());
        System.out.println("Perimeter of rectangle " + obj1.getPerimeter());
    }


}