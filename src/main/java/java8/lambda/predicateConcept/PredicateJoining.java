package java8.lambda.predicateConcept;

import java.util.function.Predicate;

public class PredicateJoining {

    public static void main(String[] args){

        int[] arr = {2,4,5,6,10,15,20,13,25,46,50,57,21,19};
        Predicate<Integer> isEven = i->i%2==0;
        Predicate<Integer> isInFiveTable = i->i%5==0;
        Predicate<Integer> isMoreThan15 = i->i>15;

        // AND operation
        System.out.println("AND Operation:");
        for(int a:arr){
            if(isEven.and(isInFiveTable).test(a)){
                System.out.println(a);
            }
        }

        // OR operation
        System.out.println("OR Operation:");
        for(int a:arr){
            if(isEven.or(isInFiveTable).test(a)){
                System.out.println(a);
            }
        }

        // NEGATE operation
        System.out.println("OR Operation:");
        for(int a:arr){
            if(isEven.negate().test(a)){
                System.out.println(a);
            }
        }

    }
}
