/**
 *  Kth Smallest Element in an Array
 */
package collectionsPrograms.Queue.priorityQueueExample;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElement {

    public static int kThSmallestElement(int[] arr, int k){
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder()); //Collections.reverseOrder() -> Java implements min heap by default.
        for(int i=0;i<k;i++){
            pq.add(arr[i]);
        }

        for(int i=k;i<arr.length;i++){
          if(arr[i]<pq.peek()){
              pq.remove();
              pq.add(arr[i]);
          }
        }

        return pq.peek();
    }

    public static void main(String[] args){
        int[] arr= {2,1,5,4,3,7,8};
        System.out.println(kThSmallestElement(arr,5));
    }
}
