/**
 *  Kth Largest Element in an Array: https://leetcode.com/problems/kth-largest-element-in-an-array/
 */
package collectionsFramework.interfaces.queues.Queue.priorityQueueExample;

import java.util.PriorityQueue;

public class KthLargestElement {

    public static int kThLargestElement(int[] arr,int k){
        PriorityQueue<Integer> pq=new PriorityQueue<>(); // Java implements min heap by default.
        for(int i=0;i<k;i++){
            pq.add(arr[i]);
        }

       for(int i=k;i<arr.length;i++){
           if(arr[i]>pq.peek()){
               pq.remove();
               pq.add(arr[i]);
           }
       }

        return pq.peek();
    }

    public static void main(String[] args){
        int[] arr= {2,1,5,4,3,7,8};
        System.out.println(kThLargestElement(arr,3));
    }
}
