/**
 * method to return the sum of two number
 */
package java8.BiFunctionalInterfaces.BiFunction;

import java.util.function.BiFunction;

public class SumOfTwoNumber {

    public static void main(String[] args){
        BiFunction<Integer, Integer, Integer> sum = (a,b)-> (a+b);

        System.out.println(sum.apply(10,20));
        System.out.println(sum.apply(20,30));
        System.out.println(sum.apply(30,40));
    }
}
