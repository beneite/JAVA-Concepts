package collectionsPrograms.hashMaps;

import java.util.HashMap;
import java.util.Map;

public class PrintHashMap {

    public static void main(String[] args){

        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"One");
        hashMap.put(2,"Two");
        hashMap.put(3,"Three");
        hashMap.put(1,"Four");

        System.out.println("printing hashmap:"+hashMap);
        System.out.println("printing hashmap using keySet():");
        for (Integer i: hashMap.keySet()) {
            int key = i;
            String value = hashMap.get(i);
            System.out.println("Key:"+key+"; value:"+value);
        }

        System.out.println("printing hashmap using entrySet():");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

    }
}
