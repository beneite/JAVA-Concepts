package java8.lambda.sortListCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyComparator implements Comparator<Integer>
{

    @Override
    public int compare(Integer t1, Integer t2) {
        if(t1>t2){
            return -1;
        } else if (t1<t2) {
            return 1;
        }else
            return 0;
    }
}


public class SortCollectionWithoutLambda {

    public static void main(String[] args){

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(5);
        arrayList.add(20);
        arrayList.add(0);
        arrayList.add(15);

        // using collections.sort to sort the collection in default order (Ascending order)
        Collections.sort(arrayList);
        System.out.println("ArrayList after Default sorting:"+arrayList );

        // using collections.sort to sort the collection
        Collections.sort(arrayList, new MyComparator() );
        System.out.println("ArrayList after Custom sorting:"+arrayList );
    }
}
