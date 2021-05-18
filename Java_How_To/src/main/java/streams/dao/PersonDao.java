package streams.dao;

import streams.model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonDao {

    public static List<Person> getAllPersons() {
        List<Person> personList = new ArrayList<>();

        Person p1 = new Person(1L, "George Washington", "USA", 1.72, 78);
        Person p2 = new Person(2L, "Benjamin Franklin", "USA", 1.64, 74);
        Person p3 = new Person(3L, "Abraham Lincoln", "USA-N", 1.85, 83);
        Person p4 = new Person(4L, "Theodore Roosevelt", "USA", 1.82, 88);
        Person p5 = new Person(5L, "Thomas Jefferson", "US", 1.68, 74);
        Person p6 = new Person(6L, "Dwight Eisenhower", "USA", 1.83, 87);


        personList.add(p3);
        personList.add(p1);
        personList.add(p4);
        personList.add(p6);
        personList.add(p5);
        personList.add(p2);

        return personList;
    }
}
