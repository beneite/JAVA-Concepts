/**
 * Write a Java 8 program to remove duplicate elements from a list using the stream API and lambda expressions.
 */
package java8.PracticalUse;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class RemoveDuplicateElement {
    public static void main(String[] args) {

        List<Integer> oneToTen = List.of(1, 2, 3, 4, 5, 1, 3, 5, 6);
        List<Integer> removeDuplicate = oneToTen.stream()
                .distinct()
                .collect(toList());

        System.out.println("After removing duplicate elements:"+removeDuplicate);
    }
}
