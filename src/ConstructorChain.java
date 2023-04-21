public class ConstructorChain {

    // member variables

    // Syntax-1 : most basic with default access modifier
    ConstructorChain() { // this is not calling any constructor
        // this(3); creates cyclic Constructor call - infinite calls
        System.out.println("Called constructor without any parameters");
    }

    // Syntax-2 : public constructor with some parameters
    public ConstructorChain(int x) {
        this();
        System.out.println("Constructor with param, x=" + x);
    }


    // Syntax-2 : public constructor with some more parameters
    public ConstructorChain(int x, int y) {
        this(x); // this is calling another overloaded constructor in this class
        System.out.println("Constructor with param, x=" + x + ", and y = " + y);
    }



    public static void main(String[] args)
    {
        NoArgConstructorClass noArgConstructorClass = new NoArgConstructorClass(); // nothing is print because of default no-arg constructor inject by java compiler.
        System.out.println(noArgConstructorClass);
        Bicycle bicycle = new Bicycle(5);

        ConstructorChain constructorChain = new ConstructorChain(3, 4);
    }
}

class Bicycle {
    public Bicycle(int x) { // it does not have any return type
        System.out.println("Explicit constructor");
    }
    public void Bicycle() { // this is method because it has return type

    }
}

class Car {

}

class NoArgConstructorClass {

}
