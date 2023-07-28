package javaBasic;

public class BMIcalculator
{
   float BMI;
   float height;
   float weight;

   void BMI(float height,float weight)
   {
      BMI=((703*weight)/(height*height));
      System.out.println(BMI);

   }

   public static void main(String[] args) {
      BMIcalculator obj=new BMIcalculator();
      obj.BMI(72,452);
   }
}
