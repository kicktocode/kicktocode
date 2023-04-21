import java.util.Scanner;

public class voteEligibility

        {
    public static void main(String[] args) {
        int age=20;
        String citizen = "indian";

        String ans= ((age>18 & citizen== "indian")? "can vote":"cannot vote");
        System.out.println(ans);



    }
}


