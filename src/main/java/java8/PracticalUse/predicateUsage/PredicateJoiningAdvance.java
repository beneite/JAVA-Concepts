/**
 * program to demonstrate how we can join multiple predicate and pass predicate as a parameter to a method
 */
package java8.PracticalUse.predicateUsage;

import java.util.function.Predicate;

public class PredicateJoiningAdvance {

    /**
     * method to print the value when it satisfies a condition
     * @param pr - pr is a predicate which will take behaviour as a value
     * @param x - number on which action should be performed.
     */
    public static void predicateMethod(Predicate<Integer> pr, int x){
        if(pr.test(x)){
            System.out.println(x);
        }
    }

    public static void main(String[] args){
        int[] arr = {2,4,5,6,10,15,20,13,25,46,50,57,21,19};
        Predicate<Integer> isEven = i->i%2 == 0;
        Predicate<Integer> isInFiveTable = i->i%5 == 0;
        Predicate<Integer> isInTenTable = i->i%10 == 0;

        System.out.println("Print all even numbers:");
        for(int a:arr) {
            predicateMethod(isEven, a);
        }

        System.out.println("Print all numbers which come in table of 2 & 5:");
        for(int a:arr) {
            predicateMethod(isEven.and(isInFiveTable), a);
        }

        System.out.println("Print all numbers which come in table of 2 Or 5:");
        for(int a:arr) {
            predicateMethod(isEven.or(isInFiveTable), a);
        }

        System.out.println("Print all numbers which come in table of 2 Or 5 but not in table of 10:");
        for(int a:arr) {
            predicateMethod(isEven.or(isInFiveTable).and(isInTenTable).negate(), a);
        }

        System.out.println("Print all numbers which are greater than 50:");
        for(int a:arr) {
            predicateMethod(i->i>50, a);
        }
    }
}
