package collectionsPrograms.hashMaps;

import org.testng.annotations.Test;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


/**
 * Divides map into segments for concurrent access
 * No null keys or values
 * You need thread-safe operations without blocking
 * High performance in multi-threaded environments
 */
public class P04_concurrentHashMap {

    @Test
    public void concurrentMapPractise(){
        Map<Integer, String> map = new ConcurrentHashMap<>();
        map.put(3, "C");
        map.put(1, "A");
        map.put(2, "B");

        map.forEach((k,v) -> System.out.println(k +"->"+ v));
    }
}
