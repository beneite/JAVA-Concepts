package java8.streams.StreamComponents.configuration;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * If we want to create a separate new object, for every object present in the collection based on our
 * requirement then we should go for map() method of Stream interface.
 * public Stream map (Function f);
 */

public class MappingOperation {

    public static void main(String[] args){

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        Stream<Integer> s = arrayList.stream();
        Stream<Integer> s1 = s.map(i->i*2);

        // Now let's perform a terminal operation to trigger the stream processing
        s1.forEach(System.out::println);
    }
}
