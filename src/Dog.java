public class Dog {
    String name;
    String breed;
    Dog(String name, String breed){
        this.name=name;
        this.breed=breed;
    }
    public String getName(){
        return name;
    }
    public String setName(String n){
        return n;
    }
    public String getBreed(){
        return breed;

    }
    public String setBreed(String b){
        return b;
    }
}
class DogDet{
    public static void main(String[]args)
    {
        Integer i;
        Dog obj= new Dog("bruno","jermanshepherd");
        System.out.println("Breed : "+obj.getBreed() + "         " + "Name : " +obj.getName());

        obj.setName("drew");
        obj.setBreed("labrador");
        System.out.println("Name:" + obj.setName("drew")+ "        "  +      "Breed:"+ obj.setBreed("labrador"));
    }
}

