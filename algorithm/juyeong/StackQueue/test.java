package algorithm.juyeong.StackQueue;

import java.util.*;

// 1. 실행 대기 큐(Queue)에서 대기중인 프로세스 하나를 꺼냅니다.
// 2. 큐에 대기중인 프로세스 중 우선순위가 더 높은 프로세스가 있다면 방금 꺼낸 프로세스를 다시 큐에 넣습니다.
// 3. 만약 그런 프로세스가 없다면 방금 꺼낸 프로세스를 실행합니다.
//   3.1 한 번 실행한 프로세스는 다시 큐에 넣지 않고 그대로 종료됩니다.
public class test {
    public static void main(String args[]){
        int[] priorities = {2, 1, 3, 2}; 
        int location = 2;
        int priority = 0;

        Queue<Integer> queue = new LinkedList<>();
        for(int prop : priorities){
            queue.offer(prop);
        }

        System.out.println(queue);

        // System.out.println(queue);

    }
}
