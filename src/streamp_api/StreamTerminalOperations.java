package streamp_api;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTerminalOperations {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Reflection", "Collection", "Stream",
                "Structure", "Sorting", "State"
        );


        // Print Each names
        System.out.println("forEach");
        names.stream().forEach(System.out::println);

        //collect : collect names strating with 's' into List

        List<String> sNames = names.stream().filter(name -> name.startsWith("S")).collect(Collectors.toList());

        System.out.println("\ncollect (names starting with 'S'):");
        sNames.forEach(System.out::println);

        // reduce: Concatenate all names into a single string
        Optional<String> concatenatedNames = names.stream().reduce((partialString, element) -> partialString + " " + element);
        System.out.println("\nreduce (concatenated names):");
        System.out.println(concatenatedNames.toString().trim());

        //Count : count the number of names
        long count = names.stream().count();
        System.out.println("\nCount");
        System.out.println(count);

        //findFirst : find the first name
        Optional<String> first = names.stream().findFirst();
        System.out.println();
        first.ifPresent(System.out::println);

        //allMatch
        boolean s = names.stream().allMatch(name -> name.startsWith("S"));
        System.out.println("\\nallMatch (all start with 'S'):");
        System.out.println(s);


    }
}
