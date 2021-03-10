package com.dp.java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class FirstExample {

   public static void main(String[] args) {

      List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

      // classic way:
      Collections.sort(names, new Comparator<String>() {

         @Override
         public int compare(String a, String b) {
            return b.compareTo(a);
         }
      });

      // using lambda
      Collections.sort(names, (String a, String b) -> {
         return b.compareTo(a);
      });

      // or
      Collections.sort(names, (String a, String b) -> b.compareTo(a));

      // shorter:
      Collections.sort(names, (a, b) -> b.compareTo(a));

      // Collections.sort(names, Comparator.reverseOrder());

   }

}
