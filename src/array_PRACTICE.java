public class array_PRACTICE {
    public static void main(String[] args) {
        int [] marks= {56,80,89,69,78};

        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+"  ");

        }
        System.out.println("\n");
        for(int i =marks.length-1;i>=0;i--){
            System.out.print(+ marks[i]+"  ");
        }
    }
}
