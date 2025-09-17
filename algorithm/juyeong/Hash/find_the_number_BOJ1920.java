package algorithm.juyeong.Hash;

import java.util.HashSet;

// - Hash에 원소를 하나씩 추가해가며 넣는다
// - 단, 전체는 넣지 않는다.
// - 왜냐하면 본인 번호가 Hash에 들어가면 contain값이 항상 true가 나오기 때문
//     - 119 → 1 , 11, 119
// - Hash에서 번호가 Hash에 있는지 찾는다.
// - 중복 없는 Hash를 사용할 것이므로, HashSet을 사용하는게 맞는듯.
public class find_the_number_BOJ1920 {
    public static void main(String[] args){
        String[] phone_book = {"119","97674223","1195524421"};
        boolean answer=true;

        HashSet<String> phone_set= new HashSet<>();

        for(String number : phone_book){
            for(int i = 1; i<number.length();i++){
                String prefix = number.substring(0, i);
                phone_set.add(prefix);
            }
        }
        
        for(String number : phone_book){
            if(phone_set.contains(number)){
                answer=false;
            }
        }

        System.out.println(answer);

    }
}
