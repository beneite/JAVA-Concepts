package collectionsPrograms.hashMaps;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class PrintHashMap {

    @DataProvider(name = "returnHasMap")
    public Object[] returnTestData(){
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"One");
        hashMap.put(2,"Two");
        hashMap.put(3,"Three");
        hashMap.put(4,"Four");

        return new Object[] {hashMap};
    }

    @Test(dataProvider = "returnHasMap")
    public void usingKeySets(HashMap<Integer,String> hashMap) {
        System.out.println("printing hashmap using keySet():");
        for (Integer i : hashMap.keySet()) {
            int key = i;
            String value = hashMap.get(i);
            System.out.println("Key:" + key + "; value:" + value);
        }
    }

    @Test(dataProvider = "returnHasMap")
    public void usingEntrySets(HashMap<Integer,String> hashMap){
        System.out.println("printing hashmap using entrySet():");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }

    @Test(dataProvider = "returnHasMap")
    public void usingStreams(Map<Integer, String> dataMap){
        System.out.println("Using usingStreams");
        dataMap.forEach((k,v) -> System.out.println(k+ " : " + v));
    }

    @Test(dataProvider = "returnHasMap")
    public void usingStreamsWithEntrySet(Map<Integer, String> dataMap){
        System.out.println("Using usingStreamsWithEntrySet");
        dataMap.entrySet().forEach(entry -> System.out.println(entry.getKey()+ " : " + entry.getValue()));
    }

    @Test(dataProvider = "returnHasMap")
    public void usingStreamsWithKeySet(Map<Integer, String> dataMap){
        System.out.println("Using usingStreamsWithKeySet");
        dataMap.keySet().forEach(key -> System.out.println(key + " : " + dataMap.get(key)));
    }
}
