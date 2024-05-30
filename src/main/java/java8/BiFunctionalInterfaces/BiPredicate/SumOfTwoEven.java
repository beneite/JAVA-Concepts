/**
 * program to check if sum of 2 number is even or not.
 */
package java8.BiFunctionalInterfaces.BiPredicate;

import java.util.function.BiPredicate;

public class SumOfTwoEven {

    public static void main(String[] args){
        BiPredicate<Integer, Integer> sumEven = (a,b) -> (a+b)%2 == 0;

        System.out.println(sumEven.test(10,20));
        System.out.println(sumEven.test(10,21));
        System.out.println(sumEven.test(11,21));
        System.out.println(sumEven.test(11,22));
    }
}
