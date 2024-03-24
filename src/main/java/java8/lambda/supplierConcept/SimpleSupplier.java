package java8.lambda.supplierConcept;

import java.util.Date;
import java.util.function.Supplier;

public class SimpleSupplier {

    public static void main(String[] args){

        Supplier<Date> s = ()->new Date();
        System.out.println("Date:"+s.get());
    }
}
