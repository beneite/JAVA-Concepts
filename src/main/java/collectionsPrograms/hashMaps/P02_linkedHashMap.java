package collectionsPrograms.hashMaps;

import org.testng.annotations.Test;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Extends HashMap
 * Keeps a doubly linked list of entries
 * Iteration order = insertion order
 * Allows one null key
 * Slightly slower than HashMap
 */
public class P02_linkedHashMap {

    @Test
    public void linkedHashMapPractise(){
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(3, "C");
        map.put(1, "A");
        map.put(2, "B");

        map.forEach((k,v) -> System.out.println(k +"->"+ v));
    }
}
