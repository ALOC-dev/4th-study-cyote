package algorithm.juyeong.Hash;
import java.util.*;

// - [이름, 종류]
//     - 이름 : value
//     - 종류 : key
// - 고르는 방식을 어떻게 할까?
//     - HashSet을 이용하여, count를 1씩 올리는 방식을 하고, 반복문 같은 경우는 0~count까지 반복, 맨 마지막의 계산 값에서 1을 빼서 계산
public class test {
    public static void main(String args[]){
        String[][]clothes ={{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};

        HashMap<String,Integer> map = new HashMap<>();

        for(String[] clothe : clothes){
            Integer count = 1;
            if(map.containsKey(clothe[1])){
                count=count+1;
            }
            map.put(clothe[1],count);
        }

        int answer = 1;
        
        Collection<Integer> values=map.values();

        for(int value : values){
            answer*=(value+1);
        }
        

        System.out.println(answer-1);

    }
}
