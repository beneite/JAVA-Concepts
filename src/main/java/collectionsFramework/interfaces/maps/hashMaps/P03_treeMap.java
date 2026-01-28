package collectionsFramework.interfaces.maps.hashMaps;

import org.testng.annotations.Test;

import java.util.Map;
import java.util.TreeMap;

/**
 * Keys are sorted (natural order or custom Comparator)
 * No null keys allowed (throws NullPointerException)
 * Values can be null
 * Performance: O(log n) for most operations
 */
public class P03_treeMap {

    @Test
    public void treeMapPractise(){
        Map<Integer, String> map = new TreeMap<>();
        map.put(3, "C");
        map.put(1, "A");
        map.put(2, "B");

        map.forEach((k,v) -> System.out.println(k +"->"+ v));
    }
}
