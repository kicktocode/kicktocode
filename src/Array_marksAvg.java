public class Array_marksAvg {
    public static void main(String[] args) {
        int []marks={89,96,97,96,99,100};
        int sum=0;
        for(int element:marks){
            sum=sum+element;
        }
        float avg=sum/marks.length;
        System.out.println("Average marks of all student is ");
    }

}
