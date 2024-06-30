/**
 * Write a Java 8 program to count the occurrence of elements from a list using the stream API and lambda expressions.
 */
package java8.PracticalUse;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountTheOccurrenceOfEachNumber {
    public static void main(String[] args) {

        List<Integer> originalList = List.of(1, 2, 3, 4, 5, 1, 3, 5, 6);

        Map<Integer, Long> numberToCountMapping = originalList.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        numberToCountMapping.forEach((k,v) -> System.out.println("Element:"+k+"; Frequency:"+v));
    }
}
