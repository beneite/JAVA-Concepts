package java8.streams.StreamComponents.processing;

import java.util.ArrayList;

/**
 * We can use toArray() method to copy elements present in the stream into specified array
 */
public class ToArrayOperation {
    public static void main(String[] args){
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(10); l1.add(20); l1.add(30);
        Integer[] ir = l1.stream().toArray(Integer[] :: new);
        for(Integer i: ir) {
            System.out.println(i);
        }
    }
}
