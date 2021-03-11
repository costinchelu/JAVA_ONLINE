package method_and_constructor_references;

public class FirstExample {

   public static void main(String[] args) {

      // implementation (no need to concrete implementation in a separate class)
      Converter<String, String> converter = new Something()::startsWith;

      // call
      String converted = converter.convert("Java");


      System.out.println(converted);
   }
}

class Something {

   String startsWith(String s) {
      return String.valueOf(s.charAt(0));
   }
}

@FunctionalInterface
interface Converter<F, T> {

   T convert(F from);
}