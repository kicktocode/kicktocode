package trycatch;

import java.io.IOException;

public class HandlingException {

    public static void main(String[] args) {
        try {
            divide(1, 0.2);
            divide(1, 0);
        } catch (NullPointerException e) { // IllegalArgumentException will not be caught here.
            System.out.println("Null Exception Error Message : " + e.getMessage());
        } catch (RuntimeException r) {
            System.out.println("Run time exception error message : " + r.getMessage());
            System.out.println("Run time exception object : " + r); // preferred logging
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
