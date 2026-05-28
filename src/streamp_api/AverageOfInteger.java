package streamp_api;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageOfInteger {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 10);
        OptionalDouble average = numbers.stream().mapToDouble(Integer::doubleValue).average();
        System.out.println("Average : " + (average.isPresent() ? average.getAsDouble() : " N/A "));
    }
}
