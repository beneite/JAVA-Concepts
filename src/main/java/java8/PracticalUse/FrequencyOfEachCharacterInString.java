package java8.PracticalUse;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfEachCharacterInString {
    public static void main(String[] args) {

        String str = "hippopotamus";

        Map<String, Long> charToCount = Arrays.stream(str.split("")).collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        charToCount.forEach((k,v) -> System.out.println("Character:"+k+"; Frequency:"+v));
    }
}
