package streamp_api;

import java.util.*;
import java.util.stream.Collectors;

public class SortedListStream {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("banana", "orange", "apple", "grape");
        List<String> collectedFruits = fruits.stream().sorted().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("Sorted : " + collectedFruits);
    }
}