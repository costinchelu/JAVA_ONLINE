package udemy_sec12c_collections_3_Map.SortedCollections;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class StockList {
    private final Map<String, StockItem> list;

    public StockList() {
        this.list = new LinkedHashMap<>();
    }

    public int addStock(StockItem item) {
        if(item != null) {
            //check if already have quantities of this item. getOrDefault will get the item from map
            //by searching the key (his name), but if no object with this name is found,
            //inStock will get info from item object (default)
            StockItem inStock = list.getOrDefault(item.getName(), item);
            //if there are already stocks on this item, inStock will be different than item and we can
            //adjust its quantity based on the method adjustStock
            if(inStock != item) {
                item.adjustStock(inStock.quantityInStock());
            }
            //after adjusting quantity we can insert the item in the map, or overwrite the old quantity
            list.put(item.getName(), item);
            return item.quantityInStock();
        }
        return 0;
    }

    public int sellStock(String item, int quantity) {
        StockItem inStock = list.getOrDefault(item, null);
        if((inStock != null) && (inStock.quantityInStock() >= quantity) && (quantity > 0)) {
            inStock.adjustStock(- quantity);
            return quantity;
        }
        return 0;
    }

    public StockItem get(String key) {
        return list.get(key);
    }

    public Map<String, StockItem> Items() {
        return Collections.unmodifiableMap(list);
    }

    @Override
    public String toString() {
        String s = "\nStock List:\n";
        double totalCost = 0.0;

        for(Map.Entry<String, StockItem> item : list.entrySet()) {
            StockItem stockItem = item.getValue();

            double itemValue = stockItem.getPrice() * stockItem.quantityInStock();

            s = s + stockItem + ". There are " + stockItem.quantityInStock() + " in stock. Value of items: ";
            s = s + String.format("%.2f", itemValue) + " $\n";
            totalCost += itemValue;
        }

        return s + "\tTotal stock value = " + String.format("%.2f", totalCost) + " $";
    }
}
