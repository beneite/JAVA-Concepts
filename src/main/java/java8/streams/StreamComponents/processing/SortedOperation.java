package java8.streams.StreamComponents.processing;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * If we sort the elements present inside stream then we should go for sorted() method.
 * the sorting can either default natural sorting order or customized sorting order specified by
 * comparator.
 * sorted()- default natural sorting order
 * sorted(Comparator c)-customized sorting order.
 */
public class SortedOperation {
    public static void main(String[] args){
        ArrayList<String> l = new ArrayList<>();
        l.add("rvk"); l.add("rk"); l.add("rkv"); l.add("rvki"); l.add("rvkir");

        List<String> l3=l.stream().sorted().collect(Collectors.toList());
        System.out.println("according to default natural sorting order:"+l3);
        List<String> l4=l.stream().sorted((s1,s2) -> -s1.compareTo(s2)).collect(Collectors.toList());
        System.out.println("according to customized sorting order:"+l4);
    }
}
