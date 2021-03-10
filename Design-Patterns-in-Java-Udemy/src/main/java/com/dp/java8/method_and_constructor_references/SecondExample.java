package com.dp.java8.method_and_constructor_references;

public class SecondExample {

   public static void main(String[] args) {

      PersonFactory<Person> personFactory = Person::new;
      Person person = personFactory.create("Piotr", "Parkovski");

      // We create a reference to the Person constructor via Person::new.
      // The Java compiler automatically chooses the right constructor
      // by matching the signature of PersonFactory.create
   }
}

// simple bean
class Person {

   String firstName;

   String lastName;

   Person() {
   }

   Person(String firstName, String lastName) {
      this.firstName = firstName;
      this.lastName = lastName;
   }
}

interface PersonFactory<P extends Person> {

   P create(String firstName, String lastName);
}