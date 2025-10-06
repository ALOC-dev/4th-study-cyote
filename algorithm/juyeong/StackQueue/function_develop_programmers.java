package algorithm.juyeong.StackQueue;
import java.util.*;

public class function_develop_programmers {
    public static void main(String args[]){
        int[] answer = {};

        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};

        Queue<int[]> progressQueue = new LinkedList<>();
        ArrayList<Integer> answerList = new ArrayList<>();

        for(int i = 0; i <progresses.length; i++){
            progressQueue.add(new int[] {progresses[i],speeds[i]});
        }

        int time = 1;
        

        while(!progressQueue.isEmpty()){ //queue가 비지 않을때까지 반복
            // 진행 률 , 속도
            int count = 0;
            int [] unit = progressQueue.poll();
            int progress = unit[0];
            int speed = unit[1];
            //시간 poll한거 기준 초기화
            int remainProgress = 100-(progress+time*speed);
            if(remainProgress>0){   //양수라면, 시간을 맞춰줘야함.
                if(remainProgress%speed == 0){
                    time += remainProgress/speed;
                }else{
                    time += remainProgress/speed+1;
                }
            }
            count +=1;
            while(!progressQueue.isEmpty()){//ProgressQueue가 비지 않고,
                if(100-(progressQueue.peek()[0]+progressQueue.peek()[1]*time)>0){
                    break;
                }
                progressQueue.poll();
                count+=1;
            }
            answerList.add(count);

        }
        answer = answerList.stream().mapToInt(Integer::intValue).toArray();

        System.out.println(answer);
    }
}
