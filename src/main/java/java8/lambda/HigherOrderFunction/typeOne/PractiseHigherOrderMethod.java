package java8.lambda.HigherOrderFunction.typeOne;

/**
 * Higher-Order Functions (HOFs) refer to functions that can accept other functions as arguments or return functions as results.
 * This functional programming concept allows you to treat functions as first-class citizens, enabling more flexible and concise code
 * Higher-order functions are a powerful concept in functional programming that allows functions to take other functions as arguments or return functions as results.
 * In Java, lambda expressions and functional interfaces enable the creation of higher-order functions, leading to more expressive and modular code
 */
public class PractiseHigherOrderMethod {

    public static void main(String[] args){
        TestInterface interOne = n -> n.toUpperCase();

        printMe(interOne);
        printMe((n)-> n.toUpperCase() + n.toLowerCase());       // TestInterface interOne = n -> n.toUpperCase(); is not required in this case
    }

    public static void printMe(TestInterface testInterface){
        String str = testInterface.interfaceMethod("Hello from print me");
        System.out.println(str);
    }
}
