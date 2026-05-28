package streamp_api;

import java.util.*;

public class SumOfTheElement {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream().mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum of the element is : " + sum);
    }
}
