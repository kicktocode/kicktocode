public class String_method {
    public static void main(String[] args) {
        String name= "Ankita";
        System.out.println(name.replace("i","c"));
        System.out.println(name.length());
        System.out.println(name.substring(1));
        System.out.println(name.substring(1,4));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        String name1= "  Ankita   ";
        System.out.println(name.trim());
        String name2= "Ankita";
        System.out.println(name2.replace("kita","nkita"));
        System.out.println(name2.startsWith("An"));
        System.out.println(name2.startsWith("Ak"));
        System.out.println(name2.endsWith("ita"));
        System.out.println(name.endsWith("kta"));
        System.out.println(name2.indexOf("a"));
        System.out.println(name2.indexOf("t",4));
        System.out.println(name2.indexOf("poxy",4));
        // return -1 when doesn't found exact watch
        String name3="Harry";
        System.out.println(name3.lastIndexOf("r"));
        System.out.println(name3.equals("Harry"));
        //always check equals string with equal method not with == operator
        System.out.println(name3.equals("harry"));
        // return false
        System.out.println(name3.equalsIgnoreCase("HaRRy"));
        // ignore casestyle and return true until character match
        System.out.println("I am space sequence \" double quote");
        // used to print double quote
        System.out.println("I am space sequence \\ double quote");
        // used to print single backslash
        System.out.println("I am space sequence \n double quote");
        // use to print next line
        System.out.println("I am space sequence \t double quote");
        // use to provide tab space
    }
}
