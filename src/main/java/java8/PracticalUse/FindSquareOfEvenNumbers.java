/**
 * program to find the square of even numbers only
 */
package java8.PracticalUse;

import java.util.Arrays;

public class FindSquareOfEvenNumbers {

    public static void main(String[] args){

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        Arrays.stream(arr).filter(i-> i % 2 == 0).map(i -> i * i).forEach(i -> System.out.println(i));

    }
}
