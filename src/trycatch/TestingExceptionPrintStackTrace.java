package trycatch;

public class TestingExceptionPrintStackTrace {

    public static void main(String[] args) {
        testException();
    }
    private static void testException() {
        testMethodCain();
    }
    private static void testMethodCain() {
        Exception exception = new Exception("error message");
        exception.printStackTrace();
    }
}
