package iterator;

public class Demo {

    public static void main(String[] args) {

        var history = new BrowseHistoryArray();
        history.push("a");
        history.push("b");
        history.push("c");

        Iterator<String> iterator = history.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
