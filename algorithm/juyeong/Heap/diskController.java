package algorithm.juyeong.Heap;
import java.util.*;

public class diskController {
    public static void main(String args[]){
        //요청 시점, 소요 시간
        
        int[][] jobs = {{0, 3}, {1, 9}, {3, 5}};
        //시간 짧은 순으로 정렬->요청시점 빠른 순으로 정렬
        PriorityQueue<int[]> waitingQueue = new PriorityQueue<>((o1,o2)->{
            if(o1[1]-o2[1]!=0){ //소요 시간이 같지 않다면, 소요시간 순으로 정렬
                return o1[1]-o2[1];
            }else{              // 소요시간이 같다면, 요청시점 빠른 순으로 정렬
                return o1[0]-o2[0];
            }
        });

        // job 큐는 요청 시점이 빠른 순으로 정렬한다.
        // 왜냐하면, 요청 시점 순으로 waiting Queue에 넣어줘야 하기 때문에.
        PriorityQueue<int[]> jobQueue = new PriorityQueue<>((o1,o2)->o1[0]-o2[0]);

        //job큐를 우선순위 큐에 넣는다.:요청시점 순으로
        for(int[] job : jobs){
            jobQueue.offer(job);
        }
        

        int time = 0;   // 절대 시간
        int[] currnetJob;   //현재 작업하고 있는 job으로 초기화
        int returnTimeSum=0;    // 총 기다린시간을 더함.
        int runningtime = 0;    // 작업하고 있는 시간까지의 제한선, 다른 작업이 침입하지 못함.
        

        // jobQueue = ()
        // waitingQueue = ( (1,9),(3,5))
        // currentJob = (0,3)
        //runningTime = 3
        //returnTimeSum = 3+5+
        // time = 8


        //waiting queue에 job 넣기
        //[문제]jobQueue가 빌때까지 반복은 맞는데, jobQueue는 비었는데 waitingQueue는 비지 않았을때, 마무리를 못함.
        while(!jobQueue.isEmpty()){//jobQueue가 비지 않을때까지 반복
            // if(jobQueue.peek()[0]> time){
            //     time++;
            //     continue;   // [문제발견] waiting Queue에 작업이 있는 상태인데, 만약 jobQueue[0]이 시간이 안됐다면? -> waitingQueue의 작업이 실행되지 않고 다음 루프로 넘어가게됨.
            // }
            while(jobQueue.peek()[0]<= time){
                waitingQueue.offer(jobQueue.poll());
                if(jobQueue.isEmpty()){
                    break;
                }
            }

            if(!waitingQueue.isEmpty() && time >=runningtime){// 1. waiting queue가 비지 않고, running time 이상일때
                currnetJob = waitingQueue.poll();//2.waitingqueue에서 job을 poll해서 새롭게 선언하고,
                runningtime = currnetJob[1] + time; //현재 소요시간 + 현재시간
                returnTimeSum+=time+currnetJob[1]-currnetJob[0];//3.time+소요시간-요청시간 을 계산해서 returnTimeSum에 덧셈을하고
                time = time + currnetJob[1];//4.time = time + 소요시간으로 갱신한다.

                if(jobQueue.isEmpty()){
                    while(!waitingQueue.isEmpty()){
                        currnetJob=waitingQueue.poll();
                        returnTimeSum+=time+currnetJob[1]-currnetJob[0];
                        time = time + currnetJob[1];
                    }
                }
                continue;
            }
            time++;
        }

        System.out.println(returnTimeSum/jobs.length);

    }
}
