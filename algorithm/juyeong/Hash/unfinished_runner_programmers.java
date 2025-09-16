package algorithm.juyeong.Hash;
import java.io.IOException;
import java.util.*;

// - 입력
//     - participant , completion받기
//     - Hash에 넣기
// - participant에서 completion에 없는 멤버 찾기
//     - 반복문으로 찾기
//         - 반복횟수 : participant 멤버
//     - Hash에서 지우기
//     - DUMMY형식으로 있다면 해당 멤버 출력하기

class unfinished_runner_programmers {
    public static void main(String args[]) throws IOException{
        //participant, completion 받기
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion  = {"stanko", "ana", "mislav"};

        HashMap<String,Integer> participantHash = new HashMap<>();

        //Hash에 넣기
        //participant의 수만큼 반복O(n)하면서, Hash에 넣는다. 
        //중복처리 : 기존에 있는 부분은 value값을 +1을 해준다.
        //Hash의 경우, O(1)이다.
        //=> 최종 복잡도 O(n)
        for(int i = 0; i<participant.length; i++){
            String key = participant[i];
            if(participantHash.containsKey(key)){
                Integer value = participantHash.get(key);
                participantHash.put(key,value+1);
                continue;
            }
            participantHash.put(participant[i],1);
        }
        
        System.out.println(participantHash);


        //for문 반복, completion돌면서 key값이 -1씩 한다.
        //completion에 있는 사람들은 0이됨
        //최종 복잡도 O(n)
        for(int i =0; i<completion.length; i++){//O(n)
            String key = completion[i];//O(1)
            Integer value = participantHash.get(key);//O(1)
            participantHash.put(key,value-1);//O(1)
        }

        System.out.println(participantHash);
        
        //완주자 value : 0
        //최종 탈락자 value : 1
        for(int i = 0; i<participant.length;i++){
            String key = participant[i];
            if(participantHash.get(key).equals(1)){
                System.out.println(key);
                break;
            }
        }
    }
}