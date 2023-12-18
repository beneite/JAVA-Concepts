/**
 * Method to display the sum of 2 no using without lambda expressions...
 */
package java8.lambda.sumOfTwo;

@FunctionalInterface
interface sumOfTwoInter{
    public void sumOfTwo(int a, int b);
}

class Numbers implements sumOfTwoInter{

    public void sumOfTwo(int a, int b) {
        System.out.println("Sum:"+(a+b));
    }
}

public class SumOfTwoWithoutLambda {

    public static void main(String[] args){
        sumOfTwoInter sumIs = new Numbers();
        sumIs.sumOfTwo(10,15);
    }
}
