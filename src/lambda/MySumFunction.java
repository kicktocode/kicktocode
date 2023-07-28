package lambda;

@FunctionalInterface
public interface MySumFunction {

    int sum(int a, int b);
}

class TestSumFunction {

    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 3};

        MySumFunction oldAnonymousClassWayImpl = new MySumFunction() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        };

        // Newer short form of defining or implementing interfaces.
        MySumFunction impl0 = (int x, int y) -> {
            return x + y;
        };

        MySumFunction impl1 = (x, y) -> {
            return x + y;
        };

        MySumFunction impl2 = (x, y) -> x + y;

        System.out.println(impl0.sum(40, 5));
        System.out.println(impl1.sum(400, 5));
        System.out.println(impl2.sum(300, 5));
        System.out.println(oldAnonymousClassWayImpl.sum(100, 5));
    }
}
