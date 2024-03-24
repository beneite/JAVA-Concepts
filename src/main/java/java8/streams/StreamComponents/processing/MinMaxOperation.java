package java8.streams.StreamComponents.processing;

import java.util.ArrayList;

/**
 * min(Comparator c)
 * returns minimum value according to specified comparator.
 * max(Comparator c)
 * returns maximum value according to specified comparator
 */
public class MinMaxOperation {
    public static void main(String[] args){
        ArrayList<String> l = new ArrayList<>();
        l.add("rvk"); l.add("rk"); l.add("rkv"); l.add("rvki"); l.add("rvkir");

        String min=l.stream().min((s1,s2) -> s1.compareTo(s2)).get();
        System.out.println("minimum value is:"+min);
        String max=l.stream().max((s1,s2) -> s1.compareTo(s2)).get();
        System.out.println("maximum value is:"+max);
    }
}
