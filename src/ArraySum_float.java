public class ArraySum_float {
    public static void main(String[] args) {
        float [] marks ={23.5f,56.5f,89,66.5f,75.5f};
        float sum = 0;
        for(float element:marks){
            sum=sum+element;
        }
        System.out.println("sum of given float elements are :"+ sum);
    }
}
