public class FindNumber_array
{
    public static void main(String[] args)
    {
        int [] number={1,2,3,5,6};
        int num=7;
        boolean IsArray=false;
        for(int element:number){
            if(element==num){
                IsArray=true;
                break;
            }
        }
        if (IsArray){
            System.out.println("yes number is present ");
        }
        else{
            System.out.println("number is not present");
        }
    }

}
