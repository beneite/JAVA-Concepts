package java8.lambda.sortListCollection;

import java.util.ArrayList;
import java.util.Collections;

public class SortCollectionWithLambda {

    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(5);
        arrayList.add(20);
        arrayList.add(0);
        arrayList.add(15);

        // using collections.sort to sort the collection
        Collections.sort(arrayList,
                (t1, t2)->
            (t1>t2)?-1:(t1<t2)?1:0
        );

        System.out.println("ArrayList after Custom sorting:"+arrayList );

    }
}
