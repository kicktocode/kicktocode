package trycatch;

public class TestingExceptionDetails {

    public static void main(String[] args) {
        divide(1, 0.2);
        divide(1, 0);
    }

    // parameter is also known as "argument"
    private static double divide(double x, double y) {
        if (y == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero, y value=" + y);
        }
        return x / y;
    }
}
