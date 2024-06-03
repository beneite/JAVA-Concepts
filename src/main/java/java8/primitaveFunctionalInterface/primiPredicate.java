package java8.primitaveFunctionalInterface;

import java.util.function.IntPredicate;

public class primiPredicate {
    public static void main(String[] args){
        IntPredicate answer = i-> i %2 ==0;

        System.out.println(answer.test(2));
        System.out.println(answer.test(3));
        System.out.println(answer.test(4));
        System.out.println(answer.test(5));
    }
}
