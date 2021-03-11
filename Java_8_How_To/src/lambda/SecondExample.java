package lambda;

/*
Each lambda corresponds to a given type, specified by an interface.
A so called functional interface must contain exactly one abstract method declaration.
Each lambda expression of that type will be matched to this abstract method.
Since default methods are not abstract you're free to add default methods to your functional interface.
 */
public class SecondExample {

   public static void main(String[] args) {
      // implementation
      Converter<String, Integer> integerConverter = (f) -> Integer.valueOf(f);

      // call
      Integer converted = integerConverter.convert("123");
      System.out.println(converted);

      // accessing local variables
      final int num = 1;
      Converter<Integer, String> stringConverter = from -> String.valueOf(from + num);
      System.out.println(stringConverter.convert(2));
   }
}

/*
 * We can use arbitrary interfaces as lambda expressions as long as the
 * interface only contains one abstract method. To ensure that your interface
 * meet the requirements, you should add the @FunctionalInterface annotation.
 * The compiler is aware of this annotation and throws a compiler error as soon
 * as you try to add a second abstract method declaration to the interface.
 */
@FunctionalInterface
interface Converter<F, T> {

   T convert(F from);
}

//In contrast to local variables we have both read and write access to instance fields
// and static variables from within lambda expressions.
// This behaviour is well known from anonymous objects.
class LambdaThirdExample {

   static int outerStaticNumber;

   int outerNumber;

   void testScopes() {
      Converter<Integer, String> stringConverter1 = (from) -> {
         outerNumber = 23;
         return String.valueOf(from);
      };

      Converter<Integer, String> stringConverter2 = (from) -> {
        outerStaticNumber = 72;
        return String.valueOf(from);
      };
   }
}