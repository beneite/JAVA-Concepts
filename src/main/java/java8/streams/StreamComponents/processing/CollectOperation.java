package java8.streams.StreamComponents.processing;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

/**
 * This method collects the elements from the stream and adding to the specified to the collection
 * indicated (specified) by argument.
 */

public class CollectOperation {

    public static void main(String[] args){
        ArrayList<String> l = new ArrayList<>();
        l.add("rvk"); l.add("rk"); l.add("rkv"); l.add("rvki"); l.add("rvkir");
        System.out.println(l);
        List<String> l2 = l.stream().map(s ->s.toUpperCase()).collect(Collectors.toList());
        System.out.println(l2);
    }
}
