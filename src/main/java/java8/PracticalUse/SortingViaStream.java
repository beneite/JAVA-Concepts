/**
 * over here we will be performing sorting via streams
 */
package java8.PracticalUse;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingViaStream {

    @DataProvider(name = "array_feeder")
    public Object[][] getDataForTestCase(){
        return new Object[][]{
                {1,7,5,3,0,2,6,3,5},
                {11,65,7,0,34,56,76,23},
                {10,15,8,49,25,98,32}
        };
    }

    @Test(dataProvider = "array_feeder")
    public void sortingTest(int[] arr){

        List<Integer> ascSortedList = Arrays.stream(arr)
                .boxed()  // Converts the int stream to Stream<Integer>
                .sorted() // Natural order sorting
                .collect(Collectors.toList());
        List<Integer> desSortedList = Arrays.stream(arr)
                .boxed()  // Converts the int stream to Stream<Integer>
                .sorted((s1,s2) -> -s1.compareTo(s2)) // comparator based sorting
                .collect(Collectors.toList());

        System.out.println("Ascending Sorted List: " + ascSortedList);
        System.out.println("Descending Sorted List: " + desSortedList);
    }
}
