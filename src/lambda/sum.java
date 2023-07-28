package lambda;

interface sum {
    public int  sumInt(int a, int b);
}

   class main{
       public static void main(String[] args) {

           sum obj= (a,b)-> {return(a+b);};
           System.out.println(obj.sumInt(10,20));

       }


   }