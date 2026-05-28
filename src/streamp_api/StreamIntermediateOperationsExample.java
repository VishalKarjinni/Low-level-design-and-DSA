package streamp_api;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamIntermediateOperationsExample {
    public static void main(String[] args) {
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("Reflection", "Collection", "Stream"),
                Arrays.asList("Structure", "State", "Flow"),
                Arrays.asList("Sorting", "Mapping", "Reduction", "Stream")
        );

        Set<String> intermediateResult = new HashSet<>();


        List<String> s1 = listOfLists.stream().flatMap(List::stream)
                .filter(s -> s.startsWith("S"))
                .map(String::toUpperCase)
                .distinct()
                .sorted()
                .peek(intermediateResult::add)
                .collect(Collectors.toList());

        System.out.println("Intermediate Result");
        intermediateResult.forEach(System.out::println);


        System.out.println("Final result");
        s1.forEach(System.out::println);

    }
}
