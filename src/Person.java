import java.io.*;
public class Person {
    String name;
    int age;
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
class detail{
    public static void main(String [] args){
        Person pax1= new Person("andrew",43);
        Person pax2= new Person("andy",40);
        System.out.println(pax1.getName() +"  "+ pax1.getAge());
        System.out.println(pax2.getName() + "  "+ pax2.getAge());
    }

}
