package java8.lambda.functionConcept;

import java.util.function.Function;

public class SimpleFunction {

    /**
     * Function<argument type, return type>
     */

    public static void main(String[] args){

        Function<Integer, Integer> squareIt = n -> n*n;
        System.out.println(squareIt.apply(10));
        System.out.println(squareIt.apply(20));

        Function<String, Integer> findLength = s ->s.length();
        System.out.println(findLength.apply("ABC"));
        System.out.println(findLength.apply("ASHish"));

    }
}
