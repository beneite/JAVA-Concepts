package java8.streams.StreamComponents.processing;

import java.util.ArrayList;

/**
 * This method returns number of elements present in the stream.
 * public long count()
 */

public class CountOperation {
    public static void main(String[] args){
        ArrayList<String> l = new ArrayList<String>();
        l.add("rvk"); l.add("rk"); l.add("rkv"); l.add("rvki"); l.add("rvkir");
        long count = l.stream().filter(s ->s.length()==5).count();
        System.out.println("The number of 5 length strings is:"+count);
    }
}
