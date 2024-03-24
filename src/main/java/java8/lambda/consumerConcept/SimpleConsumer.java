package java8.lambda.consumerConcept;

import java.util.function.Consumer;

public class SimpleConsumer {

    public static void main(String[] args){

        Consumer<String> cns = s -> System.out.println(s);
        cns.accept("Hello from consumer");

    }
}
