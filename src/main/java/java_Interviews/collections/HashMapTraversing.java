package java_Interviews.collections;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class HashMapTraversing {

    @DataProvider(name = "dataProviderToReturnHashMap")
    public Object[] returnDataSet(){
        Map<Integer, String> dataMap = new HashMap<>();
        dataMap.put(1, "A");
        dataMap.put(2, "B");
        dataMap.put(3, "C");
        dataMap.put(4, "D");

        return new Object[] {dataMap};
    }

    @Test(dataProvider = "dataProviderToReturnHashMap")
    public void usingStreams(Map<Integer, String> dataMap){
        System.out.println("Using usingStreams");
        dataMap.forEach((k,v) -> System.out.println(k+ " : " + v));
    }

    @Test(dataProvider = "dataProviderToReturnHashMap")
    public void usingStreamsWithEntrySet(Map<Integer, String> dataMap){
        System.out.println("Using usingStreamsWithEntrySet");
        dataMap.entrySet().forEach(entry -> System.out.println(entry.getKey()+ " : " + entry.getValue()));
    }

    @Test(dataProvider = "dataProviderToReturnHashMap")
    public void usingStreamsWithKeySet(Map<Integer, String> dataMap){
        System.out.println("Using usingStreamsWithKeySet");
        dataMap.keySet().forEach(key -> System.out.println(key + " : " + dataMap.get(key)));
    }
}
