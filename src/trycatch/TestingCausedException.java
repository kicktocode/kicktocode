package trycatch;

public class TestingCausedException {

    public static void main(String[] args) {
        try {
            divide(1, 0.2);
            divide(1, 0);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception Details : " + e);
            throw new RuntimeException(new RuntimeException(e));
        }
    }

    // parameter is also known as "argument"
    private static double divide(double x, double y) {
        if (y == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero, y value=" + y);
        }
        return x / y;
    }
}
