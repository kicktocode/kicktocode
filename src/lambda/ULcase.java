package lambda;

interface ULcase {
    public String upperLowercase(String str);

}
interface uppercase{
    public String upper(String str);
}
class Case{
    public static void main(String[] args) {
        ULcase obj=(str)->{return str.toLowerCase();};
        String str1="LOWERCASE";
        System.out.println(obj.upperLowercase(str1));
        uppercase obj2=(str)->{return str.toUpperCase();};
        String str2="uppercase";
        System.out.println(obj2.upper(str2));
    }
}