package lambda;


import javax.xml.namespace.QName;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class StandardLambdaFunctions {

    public static void main(String[] args) {
        Function<Integer, String> sayHelloFn = name -> "\n\n\nHello " + name;

        Function<String, String> sayByeFn = name -> "\nBye " + name;

        Function<Integer, String> clubbedFn = sayHelloFn.andThen(sayByeFn);
        System.out.println(clubbedFn.apply(123));

        Consumer<String> acceptFn;

        BiConsumer<Integer, Double> accept2ValuesFn;

        BiFunction<Integer, Integer, Integer> sumFn = (x, y) -> x + y;
    }
}
