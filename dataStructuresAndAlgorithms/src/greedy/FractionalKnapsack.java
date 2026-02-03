package greedy;

import java.util.Arrays;

public class FractionalKnapsack {

    public double getMaxValue(int[] value, int[] weight, int size, int capacity) {
        Item[] items = new Item[size];

        for (int i = 0; i < size; i++) {
            items[i] = new Item(value[i], weight[i]);
        }

//        Arrays.sort(items);
        Arrays.sort(items, (item1, item2) -> {
            double ratio1 = (double) item1.value / item1.weight;
            double ratio2 = (double) item2.value / item2.weight;
            return Double.compare(ratio2, ratio1);
        });

        double totalValue = 0;
        for (Item item: items) {
//            System.out.println(item.value + " " + item.weight + " " + (double)item.value / item.weight);
            if (item.weight <= capacity) {
                capacity -= item.weight;
                totalValue += item.value;
            } else {
                if (capacity > 0) {
                    double ratio = (double)item.value / item.weight;
                    totalValue += ratio * capacity;
                }
                break;
            }
        }
        return totalValue;
    }

    public static void main(String[] args) {
        FractionalKnapsack obj = new FractionalKnapsack();

        int[] value = {25, 24, 15};
        int[] weight = {18, 15, 10};
        System.out.println("Total Value: " + obj.getMaxValue(value, weight, value.length, 30));
    }
}

class Item implements Comparable<Item> {
    int value;
    int weight;

    Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }

    @Override
    public int compareTo(Item item) {
        double ratio1 = (double)this.value / this.weight;
        double ratio2 = (double)item.value / item.weight;
        return Double.compare(ratio2, ratio1);
    }
}