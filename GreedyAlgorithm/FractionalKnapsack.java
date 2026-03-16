import java.util.*;


class Item {
    double value;
    double weight;

    Item(double value, double weight) {
        this.value = value;
        this.weight = weight;
    }
}

class FractionalKnapsack {
    public static void main(String args[]) {
        int n = 3, weight = 50;
        Item[] arr = { new Item(100, 20), new Item(60, 10), new Item(120, 30) };  
        Solution obj = new Solution();
        double ans = obj.fractionalKnapsack(weight, arr, n);

        System.out.println("The maximum value is: " + String.format("%.2f", ans));
    }
}

class Solution {
    
    static class ItemComparator implements Comparator<Item> {
        public int compare(Item item1, Item item2) {
            double r1 = (double) item1.value / (double) item1.weight;
            double r2 = (double) item2.value / (double) item2.weight;
            return Double.compare(r2, r1);  
        }
    }

    public double fractionalKnapsack(int weight, Item[] arr, int n) {
        Arrays.sort(arr, new ItemComparator());

        double curWeight = 0.0;
        double finalvalue = 0.0;

        for (int i = 0; i < n; i++) {
            if (arr[i].weight + curWeight <= weight) {
                curWeight = arr[i].weight + curWeight;
                finalvalue += arr[i].value;
            } else {
                double remaining = weight - curWeight;
                finalvalue += (remaining / arr[i].weight) * arr[i].value;
                break;
            }
        }
        return finalvalue;
    }
}