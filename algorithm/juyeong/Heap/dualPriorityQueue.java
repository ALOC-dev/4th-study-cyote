package algorithm.juyeong.Heap;
import java.util.*;

public class dualPriorityQueue {
    public static void main(String args[]){
        String[] operations = {"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"};
        int[] answer = {0,0};

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int count = 0;

        for(String operation : operations){
            String[] array = operation.split(" ");
            String code = array[0];
            int number = Integer.parseInt(array[1]);
            if(code.equals("I")){   
                count+=1;
                minHeap.offer(number);
                maxHeap.offer(number);
            }
            if(code.equals("D")){
                if(count==0){    //count가 0이면 무시
                    continue;
                }
                count -=1;   //count -1
                if(number == 1){
                    int max =maxHeap.poll();
                    minHeap.remove(max);
                }
                if(number == -1){
                    int min = minHeap.poll();
                    maxHeap.remove(min);
                }
            }
        }
        if(count!=0){
            answer[0]=maxHeap.peek();
            answer[1]=minHeap.peek();
        }


        System.out.println(Arrays.toString(answer));
    }
    
}
