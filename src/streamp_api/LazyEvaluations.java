package streamp_api;

import java.util.*;

public class LazyEvaluations {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Aman", "Gita", "Rahul", "Sam");
        Optional<String> firstName = names.stream().filter(name -> {
            System.out.println("Filtering: " + name);
            return name.startsWith("A");
        }).map(name -> {
            System.out.println("Mapping : " + name);
            return name.toUpperCase();
        }).findFirst();
        System.out.println("First name Starting with 'S' " + firstName.orElse("None"));
    }
}
