package algorithm.juyeong.Heap;
import java.util.*;


public class minheap_exercise {
    public static void main(String args[]){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        minHeap.offer(10);
        minHeap.offer(1);
        minHeap.offer(20);
        minHeap.offer(1);

        System.out.println("Min-Heap ( 작은 값이 우선 ): ");
        while(!minHeap.isEmpty()){
            System.out.println(minHeap.poll());
        }
    }
}
