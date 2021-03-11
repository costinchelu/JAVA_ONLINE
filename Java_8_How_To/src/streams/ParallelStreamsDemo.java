package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class ParallelStreamsDemo {

    private static final int MAX = 1000000;

    public static void main(String[] args) {

        System.out.println(sequentialSort(returnListOfUuid(), false));
        System.out.println(sequentialSort(returnListOfUuid(), true));

        //Sequential sort took: 650 ms
        //Parallel sort took: 273 ms

    }

    private static String sequentialSort(List<String> values, boolean type) {
        long t0 = System.nanoTime();

        if (!type) {
            values.stream().sorted().toArray();
        } else {
            values.parallelStream().sorted().toArray();
        }

        long t1 = System.nanoTime();

        long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
        String typeOfStream = "Sequential sort took";
        if (type) {
            typeOfStream = "Parallel sort took";
        }
        return String.format(typeOfStream + ": %d ms", millis);
    }

    public static List<String> returnListOfUuid() {
        List<String> values = new ArrayList<>(MAX);
        for (int i = 0; i < MAX; i++) {
            UUID uuid = UUID.randomUUID();
            values.add(uuid.toString());
        }
        return values;
    }
}
