

public class Circle {
    float radius;
    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }
    public void setArea(float radius){
    this.radius=radius;
    double area = 2*3.14*radius*radius;
    }
    public double getArea(){
    double area = 2*3.14*radius*radius;
    return area;
    }
    public void setPerimeter(float radius){
    this.radius=radius;
        double perimeter = 2*3.14*radius;
    }
    public double getPerimeter(){
        double perimeter = 2*3.14*radius;
        return perimeter;
    }
}
class Circledet{
    public static void main(String[] args){
        Circle obj = new Circle();
        obj.setArea(25);
        System.out.println("Area :"+ obj.getArea());
        obj.setArea(15);
        System.out.println("Area :"+ obj.getArea());
        obj.setPerimeter(15);
        System.out.println("Area :"+ obj.getPerimeter());
        obj.setPerimeter(25);
        System.out.println("Area :"+ obj.getPerimeter());
    }

}