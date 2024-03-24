package java8.streams.StreamComponents.processing;

import java.util.stream.Stream;

/**
 * We can also apply a stream for group of values and for arrays.
 */
public class StreamOfOperation {
    public static void main(String[] args){
        Stream s=Stream.of(99,999,9999,99999);
        s.forEach(System.out:: println);
        Double[] d={10.0,10.1,10.2,10.3};
        Stream s1=Stream.of(d);
        s1.forEach(System.out :: println);
    }
}
