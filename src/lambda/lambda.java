package lambda;
interface test{
    void display();
}
public class lambda implements test{
    public void display(){
        System.out.println("testing");
    }

    public static void main(String[] args) {
        lambda ob1 = new lambda();
           ob1.display();
    }
}

