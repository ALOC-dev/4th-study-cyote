package algorithm.juyeong.Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeapExercise {
    public static void main(String args[]){
        //maxHeap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        maxHeap.offer(10);
        maxHeap.offer(5);
        maxHeap.offer(1);
        maxHeap.offer(3);

        System.out.println("Max-heap : ");
        while(!maxHeap.isEmpty()){
            System.out.println(maxHeap.poll());
        }

    }
    
}
