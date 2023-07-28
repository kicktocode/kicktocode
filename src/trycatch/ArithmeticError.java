package trycatch;

public class ArithmeticError {
    public static void main(String[] args) {
        int x=5;
        int y=0;
        int a=x/y;
        try{
            System.out.println("division of two integer is :"+ a);
        }
        catch (Exception e){
            System.out.println("error here is :" + e);
        }
    }
}
