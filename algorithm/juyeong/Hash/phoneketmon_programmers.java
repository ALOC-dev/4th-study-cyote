package algorithm.juyeong.Hash;
import java.util.*;

// - 폰켓몬을 중복을 허용하지 않는 Hash에 넣는다.
//     - 중복을 허용하지 않으므로, HashSet을 이용한다.
// - 전체 종류의 수를 N이라고 하자
// - Hash의 길이 값이 N/2보다 크거나 같을때에는, N/2의 값을 출력한다.
// - Hash의 길이 값이 N/2보다 작을때에는 Hash의 길이를 출력한다.
// - 예외
//     - [3,3,3,3]과 같은 경우는 어떻게 처리해야할까?


public class phoneketmon_programmers {
    public static void main(String args[]){

        Integer[] nums = {3,3,3,2,2,2};
        int N = nums.length;

        HashSet<Integer> pocketSet = new HashSet<>();
        Collections.addAll(pocketSet, nums);

        if((pocketSet.size())>=N/2){
            System.out.println(N/2);
        }else{
            System.out.println(pocketSet.size());
        }
    }
}
