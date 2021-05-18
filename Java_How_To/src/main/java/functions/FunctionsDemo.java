package functions;

import java.util.function.Function;

/**
 * Functions accept one argument and produce a result.
 * Default methods can be used to chain multiple functions together (compose, andThen).
 */
public class FunctionsDemo {

    public static void main(String[] args) {

        Function<String, Integer> toInteger = Integer::valueOf;

        Integer someInt = toInteger.apply("123");
        System.out.println(someInt);

        Function<String, String> backToString = toInteger.andThen(String::valueOf);
        backToString.apply("123");
    }
}
