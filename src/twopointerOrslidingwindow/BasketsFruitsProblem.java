package twopointerOrslidingwindow;

import java.util.HashMap;
import java.util.Map;

public class BasketsFruitsProblem {

    public int totalFruits(int[] fruits) {
        int left = 0;
        int maxFruits = 0;
        Map<Integer, Integer> basket = new HashMap<>();
        for (int right = 0; right < fruits.length; right++) {
            basket.put(fruits[right], basket.getOrDefault(fruits[right], 0) + 1);
            while (basket.size() > 2) {
                basket.put(fruits[left], basket.getOrDefault(fruits[left], 0) - 1);
                if (basket.get(fruits[left]) == 0) {
                    basket.remove(fruits[left]);
                }
                left++;
            }
            maxFruits =  Math.max(maxFruits, right - left + 1);
        }
        return maxFruits;
    }

    public static void main(String[] args) {
        BasketsFruitsProblem obj = new BasketsFruitsProblem();
        int[] fruits = {1, 2, 1, 2, 3};
        System.out.println(obj.totalFruits(fruits));
    }
}
