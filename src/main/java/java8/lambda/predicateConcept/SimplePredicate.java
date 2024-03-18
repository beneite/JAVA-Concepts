package java8.lambda.predicateConcept;

import java.util.function.Predicate;

/**
 * predicate only uses 1 parameter and return boolean value
 * use only if you have conditional checks in your program
 */

public class SimplePredicate {

    public static void main(String[] args){

        Predicate<Integer> flag = i->(i<10);

        System.out.println(flag.test(20));
        System.out.println(flag.test(10));
        System.out.println(flag.test(0));
    }
}
