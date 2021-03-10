package com.dp.java8.method_and_constructor_references;

public class FirstExample {

   public static void main(String[] args) {

      Something something = new Something();
      Converter<String, String> converter = something::startsWith;
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