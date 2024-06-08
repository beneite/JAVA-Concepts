/**
 * program to find the maximum number in an array
 */
package java8.PracticalUse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class FindTheMaximumNumber {
    public static void main(String[] args){

        ArrayList<Integer> listArray = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));

        int max = listArray.stream().mapToInt(i -> i).max().orElseThrow(() ->new NoSuchElementException("No Max value"));

        System.out.println("max:"+max);
    }
}
