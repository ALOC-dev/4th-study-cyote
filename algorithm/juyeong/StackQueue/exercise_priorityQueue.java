package algorithm.juyeong.StackQueue;

import java.util.*;

public class exercise_priorityQueue {
    public static void main(String args[]){
        Queue<Integer> pq = new PriorityQueue<>();

        pq.offer(3);
        pq.offer(1);
        pq.offer(5);

        System.out.println(pq);

        while(!pq.isEmpty()){
            System.out.println(pq.poll()+" ");
        }
    }
}
