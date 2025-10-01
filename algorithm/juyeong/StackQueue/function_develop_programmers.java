package algorithm.juyeong.StackQueue;
import java.util.*;

    // - count를 올려가며, 진행한다.
    // - i를 1 증가시키며 progress[i]≥count*speed[i] 가 될때까지 반복하고,
    // - 만약 조건이 만족하면
    // - combo값을 올린다.
    // - combo가 끊키면, 해당값을 stack에 넣고, 출력한다.

public class function_develop_programmers {
    public static void main(String args[]){

        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};

        int size = progresses.length;
        int[] need = new int[size];
        // 각 작업별 필요한 날짜 계산
        for(int i=0;i<size;i++){
            int remain = 100-progresses[i]; // 7
            need[i] = (remain + speeds[i]-1)/speeds[i]; //7/1 = 7
        }

        List<Integer> out = new ArrayList<>();
        int cur = need[0];
        int cnt = 1;

        for(int i = 1; i<size; i++){
            if(need[i]<=cur){
                cnt++ ;
            }else{
                out.add(cnt);
                cur = need[i];
                cnt = 1;
            }
        }
        out.add(cnt);

    }
}
