package streams;

import streams.model.Person;
import streams.dao.PersonDao;

import java.util.*;
import java.util.stream.Collectors;

public class GetFirstMapIndexUsingValue {

    public static void main(String[] args) {

        Map<String, Person> normalMap =
                PersonDao.getAllPersons().stream()
                        .collect(Collectors.toMap(
                                (person) -> String.valueOf(person.getId()),
                                person -> person));

        normalMap.entrySet().forEach(System.out::println);

        System.out.println("-------------------------");

        List<Person> personList = PersonDao.getAllPersons();
        Map<Integer, String> indexNameMap = personList.stream().collect(Collectors.toMap(personList::indexOf, Person::getName));
        indexNameMap.forEach((row, name) -> {
            System.out.println("POSITION: " + row + " = " + name);
        });

        System.out.println(indexNameMap.get(3));
        System.out.println(getFirstKeyByValue(indexNameMap, "Dwight Eisenhower"));


    }

    public static <T, E> T getFirstKeyByValue(Map<T, E> map, E value) {
        return (T) map.entrySet()
                .stream()
                .filter(entry -> Objects.equals(entry.getValue(), value))
                .map(Map.Entry::getKey)
                .findFirst().orElse(null);
    }
}
