package streamp_api;

import java.util.*;
import java.util.stream.Collectors;

public class EvenNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> evenNumber = numbers.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        System.out.println("Even Number :" + evenNumber);
    }
}
