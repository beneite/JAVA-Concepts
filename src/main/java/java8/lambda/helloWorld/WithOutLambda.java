/**
 * Program to display hello without using lambda expression
 */
package java8.lambda.helloWorld;

interface inter{
            public void displayHello();
        }

        class demo implements inter{

            @Override
            public void displayHello() {
                System.out.println("Hello");
            }
        }

public class WithOutLambda {

    public static void main(String[] args){
        inter i = new demo();
        i.displayHello();
    }
}
