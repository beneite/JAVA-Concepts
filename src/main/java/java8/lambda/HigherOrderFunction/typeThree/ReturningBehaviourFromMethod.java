package java8.lambda.HigherOrderFunction.typeThree;

import java8.lambda.HigherOrderFunction.typeOne.TestInterface;

public class ReturningBehaviourFromMethod {

    public static void main(String[] args){
        String str = executeUpperCase().interfaceMethod("Ashish");
        System.out.println(str);

        String str2 = executeLowerCase().interfaceMethod("Ashish");
        System.out.println(str2);
    }

    public static TestInterface executeUpperCase(){
        TestInterface testInterface = (n)-> n.toUpperCase();            // Function as first class object
        return testInterface;                                           // returning the behaviour
    }

    public static TestInterface executeLowerCase(){
        return (n)->n.toLowerCase();                                           // returning the behaviour
    }
}
