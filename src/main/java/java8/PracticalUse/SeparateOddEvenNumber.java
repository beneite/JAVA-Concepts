/**
 * Given a list of integers, write a Java 8 program to separate the odd and even numbers into two separate lists.
 */
package java8.PracticalUse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.partitioningBy;


public class SeparateOddEvenNumber {
    public static void main(String[] args){

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // solution 1: creating separate list and storing the value after filtration
        List<Integer> evenList = list.stream().filter(i-> i%2 == 0).collect(Collectors.toList());
        List<Integer> oddList = list.stream().filter(i-> i%2 != 0).collect(Collectors.toList());

        System.out.println("Original List:"+list);
        System.out.println("Even List:"+evenList);
        System.out.println("Odd List:"+oddList);

        Map<Boolean, List<Integer>> evenAddOddSeparation = list.stream().collect(partitioningBy(i -> i % 2 == 0));

        System.out.println("solution 2:"+evenAddOddSeparation);
    }
}
