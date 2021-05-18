package suppliers_and_consumers;

import java.util.function.Consumer;
import java.util.function.Supplier;


public class SuppliersAndConsumersDemo {

    public static void main(String[] args) {

        // Suppliers produce a result of a given generic type.
        // Unlike Functions, Suppliers don't accept arguments.
        Supplier<Person> personSupplier = Person::new;
        personSupplier.get();
        System.out.println(personSupplier.get());

        // Consumers represents operations to be performed on a single input argument.
        Consumer<Person> greeter = p -> System.out.println("Hello, " + p.getFirstName());
        greeter.accept(new Person("Bruce", "Wayne"));
    }
}
