public class String_practice_ques {
    public static void main(String[] args) {
        String name= "TRIVEDI";
        System.out.println(name.toLowerCase());
        String name2= "T R I V E D I";
        System.out.println(name2.replace(" ","_"));
        String name1="Dear name,thanks a lot ";
        System.out.println(name1.replace("name","Tom"));
        String name3= "T  R  I V   E D I";
        System.out.println(name3.indexOf("  "));
        System.out.println(name3.indexOf("   "));
        System.out.println("Dear Harry,This course is nice. \nThanks");
    }
}
