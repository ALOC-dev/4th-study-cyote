package algorithm.juyeong.StackQueue;
import java.util.*;


public class truck_programmers {
    public static void main(String args[]){
        int bridge_legth = 100;
        int weight = 100;
        int[] truck_weights = {10,10,10,10,10,10,10,10,10,10};
        int time = 0;
        int sum = 0;


        Queue<Integer> waitingQueue = new LinkedList<>();
        Queue<int[]> runningQueue = new LinkedList<>();

        for(int truck : truck_weights){
            waitingQueue.offer(truck);
        }
        //조건이 두개있는 느낌.
        do {
            if(!runningQueue.isEmpty()){
                int[] truckObject = runningQueue.peek();    
                int truckWeight = truckObject[0];
                int startTime = truckObject[1];
                if(startTime+bridge_legth==time){
                    sum-=truckWeight;
                    runningQueue.poll();
                }
                // time=startTime+bridge_legth;    
            }
            if(!waitingQueue.isEmpty()&&sum+waitingQueue.peek()<=weight){
                int truckWeight = waitingQueue.poll();
                sum+=truckWeight;
                runningQueue.offer(new int[] {truckWeight,time});
            }
            time+=1;
        } while (!runningQueue.isEmpty());


    }
}
