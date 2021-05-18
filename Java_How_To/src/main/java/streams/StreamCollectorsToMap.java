package streams;

import streams.model.Person;
import streams.dao.PersonDao;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamCollectorsToMap {

    public static void main(String[] args) {

        List<Person> personList = PersonDao.getAllPersons();

        Map<String, Person> personsMap = personList
                        .stream()
                        .collect(Collectors.toMap(Person::getName, person -> person));

        System.out.println(personsMap);
    }
}
