package streamp_api;

import java.util.*;

public class CountStringChar {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "orange", "grape");
        char searchChar = 'a';

        long count = strings.stream().filter(str -> str.contains(String.valueOf(searchChar))).count();
        System.out.println("Number of String containing : " + count);
    }
}
