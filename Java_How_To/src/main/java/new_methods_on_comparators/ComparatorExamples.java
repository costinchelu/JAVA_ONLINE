package new_methods_on_comparators;

import suppliers_and_consumers.Person;

import java.util.Comparator;

public class ComparatorExamples {

    public static void main(String[] args) {

        Comparator<Person>  personComparator = Comparator.comparing(Person::getFirstName);

        Person p1 = new Person("John", "Doe");
        Person p2 = new Person("Alice", "Wonderland");

        personComparator.compare(p1, p2);             // > 0
        personComparator.reversed().compare(p1, p2);  // < 0
    }
}
