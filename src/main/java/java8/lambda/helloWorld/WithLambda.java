/**
 * Program to display hello using lambda expression
 */
package java8.lambda.helloWorld;

@FunctionalInterface
interface lambdaInter{
    public void display();
}

public class WithLambda {

    public static void main(String[] args){
        lambdaInter inter = () -> System.out.println("Hello");
        inter.display();
    }
}
