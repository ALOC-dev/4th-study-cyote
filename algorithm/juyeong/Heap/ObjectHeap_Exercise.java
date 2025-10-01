package algorithm.juyeong.Heap;

import java.util.PriorityQueue;

class Task{
    String name;
    int priority;

    public Task(String name, int priority){
        this.name=name;
        this.priority=priority;
    }

    @Override
    public String toString(){
        return name + "(priority : "+ priority + ")";
    }
}



public class ObjectHeap_Exercise {
    public static void main(String args[]){
        PriorityQueue<Task> taskHeap = new PriorityQueue<>();

        taskHeap.offer(new Task("공부하기", 3));
        taskHeap.offer(new Task("게임하기",5));
        taskHeap.offer(new Task("운동하기", 2));
        taskHeap.offer(new Task("청소하기", 1));

        System.out.println("작업 우선순위 : ");
        while(!taskHeap.isEmpty()){
            System.out.println(taskHeap.poll());
        }
    }
}
