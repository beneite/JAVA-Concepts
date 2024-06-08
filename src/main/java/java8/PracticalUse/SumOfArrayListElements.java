/**
 * method to find the sum of all the even numbers in an array
 */
package java8.PracticalUse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfArrayListElements {

    public static void main(String[] args){

        ArrayList<Integer> listArray = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));

        int sum = listArray.stream().filter(i -> i%2==0).mapToInt(i ->i).sum();
        System.out.println("sum:"+sum);
    }
}
