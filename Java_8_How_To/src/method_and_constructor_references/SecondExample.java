package method_and_constructor_references;

import suppliers_and_consumers.Person;

public class SecondExample {

   public static void main(String[] args) {

      PersonFactory<Person> personFactory = Person::new;
      Person person = personFactory.create("Piotr", "Parkovski");

      // We create a reference to the Person constructor via Person::new.
      // The Java compiler automatically chooses the right constructor
      // by matching the signature of PersonFactory.create
   }
}

interface PersonFactory<P extends Person> {

   P create(String firstName, String lastName);
}