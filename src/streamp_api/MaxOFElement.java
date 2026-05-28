package streamp_api;

import java.util.*;
import java.util.stream.IntStream;

public class MaxOFElement {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 8, 6, 10);
        OptionalInt max = numbers.stream().mapToInt(Integer::intValue).max();
        System.out.println("Max from elements :" + max);
    }
}
