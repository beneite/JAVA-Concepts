package java8.streams.StreamComponents.processing;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * This method collects the elements from the stream and adding to the specified to the collection
 * indicated (specified) by argument.
 */

public class CollectOperation {

    public static void main(String[] args){
        ArrayList<String> l = new ArrayList<>();
        l.add("abc"); l.add("def"); l.add("ghivv"); l.add("jkl"); l.add("mnop");
        System.out.println(l);
        // collecting into a List
        List<String> l2 = l.stream().map(s ->s.toUpperCase()).collect(Collectors.toList());
        System.out.println("List:"+l2);

        // collecting into a Set
        Set<String> intoSet = l.stream().map(s ->s.toUpperCase()).collect(Collectors.toSet());
        System.out.println("Set:"+intoSet);

        // collecting into a Single String
        String joiningToString = l.stream().map(s ->s.toUpperCase()).collect(Collectors.joining());
        System.out.println("Joining string:"+joiningToString);

        // collecting into a Single String with comma separated
        String joiningToStringWithCommas = l.stream().map(s ->s.toUpperCase()).collect(Collectors.joining(","));
        System.out.println("joiningToStringWithCommas string:"+joiningToStringWithCommas);

        // collecting and grouping them by their length.
        Map<Integer, List<String>> groupByLength = l.stream().map(s ->s.toUpperCase()).collect(Collectors.groupingBy(str -> str.length()));
        System.out.println("groupByLength:"+groupByLength);

    }
}
