package java8.lambda.HigherOrderFunction.typeTwo;

/**
 * over here we are passing the behaviour to the method, considering the method has the data. this flow is totally opposite to conventional flow
 * where we provide the data to a method and the method will perform some operation as per the method definition.
 */

public class PassingBehaviourAsParameter {

    public static void main(String[] args){
        test(n->n.toLowerCase());
        test(n->n.toUpperCase());
    }

    public static void test(TestInterface testInterface){
        String str = testInterface.interfaceMethod("Ashish");
        System.out.println(str);
    }
}
