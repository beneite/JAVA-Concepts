package java8.lambda.functionConcept;

import java.util.function.Function;

public class FunctionChaining {

    public static void main(String[] args){

        Function<Integer, Integer> squareIt = n -> n*n;
        Function<Integer,Boolean> isEven = n ->n%2==0;

        // AndThen() - first squareIt will be executed and then isEven
        System.out.println(squareIt.andThen(isEven).apply(10));
        System.out.println(squareIt.andThen(isEven).apply(9));

        // compose() - first squareIt will be executed and then isEven
        System.out.println(isEven.compose(squareIt).apply(10));
        System.out.println(squareIt.andThen(isEven).apply(9));
    }
}
