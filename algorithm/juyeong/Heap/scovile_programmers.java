package algorithm.juyeong.Heap;
import java.util.*;

public class scovile_programmers {
    public static void main(String args[]){
        // - 모든 음식의 스코빌 지수를 K 이상 만들어야함.
        // - 스코빌 지수 낮은 두개의 음식을 뽑아, 새로운 음식을 만듬(반복)
        // - `섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)`
        // - 섞어야 하는 최소 횟수를 return하도록 solution 함수 작성하기
        // - 모든 음식의 scovile 지수를 K이상으로 만들 수 없는 경우 -1 을 출력함.
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;
        int count = 0;

        //스코빌 지수 낮은 정렬을 하기위해, 우선순위 큐 사용
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int sc : scoville){
            pq.offer(sc);
        }

        while(pq.peek()<K){    //우선 계속 반복하기
            if(pq.size()==1){
                count = -1;
                break;
            }
            int a = pq.poll();
            int b = pq.poll();
            int paste = a+b*2; // 꺼내서 반죽
            
            pq.offer(paste); //반죽 넣고
            count +=1;  //카운트 증가
        }
        System.out.println(count);

    }
}
