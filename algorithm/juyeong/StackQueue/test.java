package algorithm.juyeong.StackQueue;

import java.util.*;

// 1. 실행 대기 큐(Queue)에서 대기중인 프로세스 하나를 꺼냅니다.
// 2. 큐에 대기중인 프로세스 중 우선순위가 더 높은 프로세스가 있다면 방금 꺼낸 프로세스를 다시 큐에 넣습니다.
// 3. 만약 그런 프로세스가 없다면 방금 꺼낸 프로세스를 실행합니다.
//   3.1 한 번 실행한 프로세스는 다시 큐에 넣지 않고 그대로 종료됩니다.
public class test {
    public static void main(String args[]){
        int[] priorities = {1,1,9,1,1,1}; 
        int location = 0;
        int answer = 0;
        int max = 0;
        int order = 0;

        Queue<int[]> queue = new LinkedList<>();
        //원소 큐에 집어넣기
        for(int i =0 ; i<priorities.length;i++){
            queue.offer(new int[] {i,priorities[i]});
            if(max<priorities[i]){  //최대 우선순위 값 갱신
                max = priorities[i];
            }
        }

        while(!queue.isEmpty()){
            int[] object = queue.poll();
            int index = object[0];
            int priority = object[1];

            if(priority < max){
                queue.offer(object);    //우선순위 더 큰 값이 있다면, 다시 넣는다.
                continue;
            }

            order +=1;

            // 우선순위가 제일 큰 값이 뽑혔다면,
            if(index == location){
                answer = order;
                break;
            }
            max = 0;

            for(int[] unit : queue){
                if(max<unit[1]){
                    max = unit[1];
                }
            }
            
            
        }

        System.out.println(answer);
    }

}

