/**
 * Suppose you have a list of lists containing strings, and you want to flatten this list of lists into a single list of strings.
 */
package java8.streams.StreamComponents.processing;

import java.util.Arrays;
import java.util.List;

public class FlatMapOperation {
    public static void main(String[] args) {
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );

        // Calculate the sum of all integers using flatMap
        int sum = listOfLists.stream()
                .flatMapToInt(list -> list.stream().mapToInt(Integer::intValue))
                .sum();

        // Print the sum
        System.out.println("Sum of all integers: " + sum);
    }
}
