package java8.streams.StreamComponents.configuration;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * We can configure a filter to filter elements from the collection based on some boolean condition by
 * using filter()method of Stream interface.
 * public Stream filter(Predicate<T> t)
 * here (Predicate<T > t ) can be a boolean valued function/lambda expression
 */

public class FilterOperation {

    public static void main(String[] args){

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        Stream<Integer> s = arrayList.stream();
        Stream<Integer> s1 = s.filter(i ->i%2==0);

        // Now let's perform a terminal operation to trigger the stream processing
        s1.forEach(System.out::println);

    }
}
