/**
 * Method to display the sum of 2 no using lambda expressions...
 */
package java8.lambda.sumOfTwo;

@FunctionalInterface
interface inter{
    public void sumOfTwo(int a, int b);
}

public class SumOfTwoWithLambda {
    public static void main(String[] args){

        inter s2 = (a,b) -> System.out.println("SUM:"+(a+b));

        s2.sumOfTwo(10,15);
    }

}
