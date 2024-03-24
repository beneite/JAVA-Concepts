package java8.streams.StreamComponents.processing;

import java.util.ArrayList;

/**
 * This method will not return anything.
 * This method will take lambda expression as argument and apply that lambda expression for each
 * element present in the stream.
 */
public class ForEachOperation {
    public static void main(String[] args){

        ArrayList<String> l = new ArrayList<>();
        l.add("rvk"); l.add("rk"); l.add("rkv"); l.add("rvki"); l.add("rvkir");

        l.stream().forEach(s-> System.out.println(s));
        l.stream().forEach(System.out:: println);
    }
}
