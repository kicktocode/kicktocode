package lambda;
import java.util.*;
interface EmptyString{
   public boolean isEmpty(String str);
}
class string{
    public static void main(String[] args) {
        EmptyString obj= (str)->str.isEmpty();
        String str1="";
        String str2 = "not empty string ";
        System.out.println(obj.isEmpty(str1));
        System.out.println(obj.isEmpty(str2));
    }

}