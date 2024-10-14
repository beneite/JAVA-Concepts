/**
 * Given a list of integers, find out all the numbers starting with n using Stream functions?
 */
package java8.PracticalUse;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindAllTheNumberStartingWith {

    @DataProvider(name = "array_feeder")
    public Object[][] getDataForTestCase(){
        return new Object[][]{
                {new int[]{10,15,8,49,25,98,32},1},
                {new int[]{10,15,8,49,25,98,32},2},
                {new int[]{10,15,8,49,25,98,32},3},
                {new int[]{10,15,8,49,25,98,32},9}
        };
    }

    @Test(dataProvider = "array_feeder")
    public void testTheNumberStarting(int[] arr, int numberOfChoice){

        List<Integer> filteredList  = Arrays.stream(arr).
                mapToObj(e -> String.valueOf(e)).
                filter(e -> e.startsWith(String.valueOf(numberOfChoice))).
                map(e -> Integer.parseInt(e)).
                collect(Collectors.toList());
        System.out.println("filteredList is "+numberOfChoice+":"+filteredList);
    }
}
