public class ArithmaticOperations {

        public static void main(String[] args) {
            int num1 = 18;
            float num2 = 3;

            int num3 = ++num1;
            System.out.println("num3" + num3);
            System.out.println("Addition of three numbers num1, num2, and num3 is " + (num1 + num2 + num3));

            int num4 = num3--;
            System.out.println("num4 "+ num4);
            System.out.println("Subtraction of three numbers (num1-num2-num3) is " + (num1 - num2 - num3));

            System.out.println("Multiplication of all four numbers (num1*num2*num3*num4) is " + (num1 * num2 * num3 * num4));

            System.out.println("Division of (num1/num2) is " + (num1 / num2));

            int num5 = --num4;
            System.out.println("num5 "+ num5);
            System.out.println("Modulo of (num5%7) is " + (num5 % 7));

        }
    }

