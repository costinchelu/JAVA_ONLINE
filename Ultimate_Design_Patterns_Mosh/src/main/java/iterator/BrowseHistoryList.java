package iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistoryList {

    private List<String> urls = new ArrayList<>();


    public void push(String url) {
        urls.add(url);
    }

    public String pop() {
        String  lastIndex = urls.get(urls.size() - 1);
        urls.remove(urls.size() - 1);
        return lastIndex;
    }

    public Iterator<String> createIterator() {
        return new ListIterator(this);
    }


    public class ListIterator implements Iterator<String> {

        private BrowseHistoryList history;
        private int index;

        public ListIterator(BrowseHistoryList history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < history.urls.size());
        }

        @Override
        public String current() {
            return history.urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
}
