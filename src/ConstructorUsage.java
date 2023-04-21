public class ConstructorUsage {
    int x = 5; // default value is 5
    int y; // default value is 0
    public ConstructorUsage(int x, int y) {
        System.out.println("this.x=" + this.x + ", this.y=" + this.y);
        System.out.println("Params x = " + x + ", y = " + y);
        this.x = x + y; // this is used to refer the object address
        y = y;
        System.out.println("Inside constructor with 2 params, x = " + x +", y = " + y);
        System.out.println("this.x=" + this.x + ", this.y=" + this.y);
    }

    public static void main(String[] args) {
        ConstructorUsage cu = new ConstructorUsage(3, 4);
        System.out.println(cu.y +"A"+ cu.x);
        System.out.println(cu.y +'A'+ cu.x); // char is replaced by it's ASCII value in arithmetic operation
    }
}
