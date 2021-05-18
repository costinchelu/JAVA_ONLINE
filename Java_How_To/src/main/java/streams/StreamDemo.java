package streams;


import suppliers_and_consumers.Person;

import java.util.*;
import java.util.concurrent.ForkJoinPool;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * A java.util.Stream represents a sequence of elements
 * on which one or more operations can be performed.
 * Stream operations are either intermediate or terminal.
 * While terminal operations return a result of a certain type,
 * intermediate operations return the stream itself
 * so you can chain multiple method calls in a row.
 * Streams are created on a source, e.g. a java.util.Collection like lists or sets (maps are not supported).
 * Stream operations can either be executed sequential or parallel.
 * An important characteristic of intermediate operations is laziness.
 *
 * A function is non-interfering when it does not modify the underlying data source of the stream, \
 * e.g. in the below example no lambda expression does modify stringCollection
 * by adding or removing elements from the collection.
 *
 * A function is stateless when the execution of the operation is deterministic,
 * e.g. in the above example no lambda expression depends on any mutable variables
 * or states from the outer scope which might change during execution.
 *
 * Java 8 streams cannot be reused. As soon as you call any terminal operation the stream is closed
 */
public class StreamDemo {

    public static void main(String[] args) {

        Stream.of("a1", "a2", "a3")
                .findFirst()
                .ifPresent(System.out::println);  // a1

        // IntStreams can replace the regular for-loop utilizing IntStream.range():
        IntStream.range(1, 4)
                .forEach(System.out::println);

        Arrays.stream(new int[] {1, 2, 3})
                .map(n -> 2 * n + 1)
                .average()
                .ifPresent(System.out::println);  // 5.0

        Stream.of("a1", "a2", "a3")
                .map(s -> s.substring(1))
                .mapToInt(Integer::parseInt)
                .max()
                .ifPresent(System.out::println);  // 3

        IntStream.range(1, 4)
                .mapToObj(i -> "a" + i)
                .forEach(System.out::println);

        // a1
        // a2
        // a3

        // The operation anyMatch returns true as soon as the predicate applies
        // to the given input element. This is true for the second element
        // passed "A2". Due to the vertical execution of the stream chain,
        // map has only to be executed twice in this case. So instead of mapping
        // all elements of the stream, map will be called as few as possible.
        Stream.of("d2", "a2", "b1", "b3", "c")
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .anyMatch(s -> {
                    System.out.println("anyMatch: " + s);
                    return s.startsWith("A");
                });
        // map:      d2
        // anyMatch: D2
        // map:      a2
        // anyMatch: A2

        Stream.of("d2", "a2", "b1", "b3", "c")
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return s.startsWith("A");
                })
                .forEach(s -> System.out.println("forEach: " + s));

        // map:     d2
        // filter:  D2
        // map:     a2
        // filter:  A2
        // forEach: A2
        // map:     b1
        // filter:  B1
        // map:     b3
        // filter:  B3
        // map:     c
        // filter:  C

        // Sorting is a special kind of intermediate operation.
        // It's a so called stateful operation since in order to sort a collection of elements
        // you have to maintain state during ordering.
        Stream.of("d2", "a2", "b1", "b3", "c")
                .sorted((s1, s2) -> {
                    System.out.printf("sort: %s; %s\n", s1, s2);
                    return s1.compareTo(s2);
                })
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return s.startsWith("a");
                })
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .forEach(s -> System.out.println("forEach: " + s));

        //  sort:    a2; d2
        //  sort:    b1; a2
        //  sort:    b1; d2
        //  sort:    b1; a2
        //  sort:    b3; b1
        //  sort:    b3; d2
        //  sort:    c; b3
        //  sort:    c; d2
        //  filter:  a2
        //  map:     a2
        //  forEach: A2
        //  filter:  b1
        //  filter:  b3
        //  filter:  c
        //  filter:  d2


        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");

        List<Person> persons = Arrays.asList(
                new Person("Max", "Mad"),
                new Person("Peter", "Pan"),
                new Person("Pamela", "Pan"),
                new Person("David", "Mad"));


        // Filter accepts a predicate to filter all elements of the stream.
        // This operation is intermediate which enables us to call another stream operation
        // (forEach) on the result. ForEach accepts a consumer to be executed for each element
        // in the filtered stream. ForEach is a terminal operation.
        // It's void, so we cannot call another stream operation.
        System.out.println("--FILTER");

        stringCollection
                .stream()
                .filter(s -> s.startsWith("a"))
                .forEach(System.out::println);      // "aaa2", "aaa1"

        // Sorted is an intermediate operation which returns a sorted view of the stream.
        // The elements are sorted in natural order unless you pass a custom Comparator.
        System.out.println("--SORTED");

        stringCollection
                .stream()
                .sorted()
                .filter(s -> s.startsWith("a") || s.startsWith("b"))
                .forEach(System.out::println);

        // The intermediate operation map converts each element into another object
        // via the given function. The following example converts each string
        // into an upper-cased string. But you can also use map to transform each object
        // into another type. The generic type of the resulting stream
        // depends on the generic type of the function you pass to map.
        System.out.println("--MAP");

        stringCollection
                .stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        // Various matching operations can be used to check whether a certain predicate
        // matches the stream. All of those operations are terminal and return a boolean result.
        System.out.println("--ANY MATCH");

        boolean anyStartsWithA = stringCollection.stream()
                .anyMatch(s -> s.startsWith("a"));
        System.out.println(anyStartsWithA);

        System.out.println("--ALL MATCH");

        boolean allStartsWithA = stringCollection.stream()
                .allMatch(s -> s.startsWith("a"));
        System.out.println(allStartsWithA);

        System.out.println("--NONE MATCH");

        boolean noneStartsWithA = stringCollection.stream()
                .noneMatch(s -> s.startsWith("z"));
        System.out.println(noneStartsWithA);

        // Count is a terminal operation returning the number of elements in the stream as a long.
        System.out.println("--COUNT");

        long startsWithB =
                stringCollection
                        .stream()
                        .filter((s) -> s.startsWith("b"))
                        .count();

        System.out.println(startsWithB);    // 3

        // This terminal operation performs a reduction on the elements of the stream
        // with the given function. The result is an Optional holding the reduced value.
        System.out.println("--REDUCE");

        Optional<String> reducedString = stringCollection
                .stream()
                .filter(s -> s.startsWith("c") || s.startsWith("d"))
                .sorted(Comparator.reverseOrder())
                .reduce((s1, s2) -> s1 + "_#_" + s2);

        reducedString.ifPresent(System.out::println);

        System.out.println("--REDUCE-2");

        persons.stream()
                .reduce((p1, p2) -> p1.getLastName().equals(p2.getLastName()) ? p1 : p2)
                .ifPresent(System.out::println);

        // Collect is an extremely useful terminal operation to transform the elements of the stream
        // into a different kind of result, e.g. a List, Set or Map.
        // Collect accepts a Collector which consists of four different operations:
        // a supplier, an accumulator, a combiner and a finisher.
        // This sounds super complicated at first, but the good part is Java 8 supports
        // various built-in collectors via the Collectors class.
        // So for the most common operations you don't have to implement a collector yourself.
        System.out.println("--COLLECT");

        List<Person> filteredList = persons.stream()
                .filter(person -> person.getFirstName().startsWith("P"))
                .collect(Collectors.toList());
        System.out.println(filteredList);

        // for sets:
//        List<Person> filteredList = persons.stream()
//                .filter(person -> person.getFirstName().startsWith("P"))
//                .collect(Collectors.toSet());
        System.out.println("--COLLECT-2");

        Map<String, List<Person>> personsByLastName = persons.stream()
                .collect(Collectors.groupingBy(Person::getLastName));

        personsByLastName.forEach((lastName, person) -> System.out.format("Last name %s: %s\n", lastName, person));


        // Java 8 streams cannot be reused. As soon as you call any terminal operation the stream is closed.
        // To overcome this limitation we have to to create a new stream chain for every terminal operation
        // we want to execute, e.g. we could create a stream supplier to construct
        // a new stream with all intermediate operations already set up:
        Supplier<Stream<String>> streamSupplier = () -> Stream.of("d2", "a2", "b1", "b3", "c")
                .filter(s -> s.startsWith("a"));

        // joining:
        System.out.println("--COLLECT-3");
        String phrase = persons
                .stream()
                .filter(p -> p.getLastName().equals("Mad"))
                .map(Person::getFirstName)
                .collect(Collectors.joining(" and ", ">>> ", " have the same last name"));

        System.out.println(phrase);

        streamSupplier.get().anyMatch(s -> true);
        streamSupplier.get().forEach(System.out::println);

        // EXAMPLE: we want to transform all persons of the stream into a single string
        // consisting of all names in upper letters separated by the | pipe character.
        // In order to achieve this we create a new collector via Collector.of().
        // We have to pass the four ingredients of a collector:
        // a supplier, an accumulator, a combiner and a finisher.
        System.out.println("--COLLECT-4");
        Collector<Person, StringJoiner, String> personNameCollector =
                Collector.of(
                        () -> new StringJoiner(" | "),          // supplier
                        (j, p) -> j.add(p.getFirstName().toUpperCase()),  // accumulator
                        StringJoiner::merge,               // combiner
                        StringJoiner::toString);                // finisher

        String names = persons
                .stream()
                .collect(personNameCollector);

        System.out.println(names);  // MAX | PETER | PAMELA | DAVID

        // Since strings in Java are immutable, we need a helper class like StringJoiner
        // to let the collector construct our string.
        // The supplier initially constructs such a StringJoiner with the appropriate delimiter.
        // The accumulator is used to add each persons upper-cased name to the StringJoiner.
        // The combiner knows how to merge two StringJoiners into one.
        // In the last step the finisher constructs the desired String from the StringJoiner.

        System.out.println("--FLAT MAP");
        List<Foo> fooList = new ArrayList<>();

        IntStream
                .range(1, 4)
                .forEach(i -> fooList
                        .add(new Foo("Foo" + i)));

        fooList.forEach(foo -> IntStream
                        .range(1, 4)
                        .forEach(i -> foo.bars
                                .add(new Bar("Bar" + i + " <- " + foo.name))));

        fooList.stream()
                .flatMap(f -> f.bars.stream())
                .forEach(b -> System.out.println(b.name));

        // Bar1 <- Foo1
        // Bar2 <- Foo1
        // Bar3 <- Foo1
        // Bar1 <- Foo2
        // Bar2 <- Foo2
        // Bar3 <- Foo2
        // Bar1 <- Foo3
        // Bar2 <- Foo3
        // Bar3 <- Foo3

        // alternative, we can:
        IntStream.range(1, 4)
                .mapToObj(i -> new Foo("Foo" + i))
                .peek(f -> IntStream.range(1, 4)
                        .mapToObj(i -> new Bar("Bar" + i + " <- " + f.name))
                        .forEach(f.bars::add))
                .flatMap(f -> f.bars.stream())
                .forEach(b -> System.out.println(b.name));



    }
}
