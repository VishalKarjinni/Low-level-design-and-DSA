package streamp_api;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StringsToUpperCase {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "orange", "grape");
        List<String> upperCases = strings.stream().map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Uppercase String :" + upperCases);

    }
}
