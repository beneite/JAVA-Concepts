/**
 * method to check for even number , which should be greater than 5 also find square and add 2 to it
 */
package java8.PracticalUse;

import java.util.Arrays;

public class UsingMultipleOperationExampleOne {

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        Arrays.stream(arr).filter(i -> i%2 ==0).filter(i -> i>5).map(i -> i*i).map(i->i+2).forEach(i ->System.out.println(i));
    }
}
