package algorithm.juyeong.Hash;

import java.util.*;


public class STL_exercise {
    public static void main(String args[]){
        //1. ArrayList , 순서 O , 중복 O
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Apple");

        System.out.println("ArrayList"+list);

        //2. HashSet (집합, 순서 X, 중복 X)
        //HashSet도 내부적으로는, HashMap처럼 동작함 map.put("Apple",DUMMY_VALUE);와 같이 동작함.
        HashSet<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Apple");

        System.out.println("HashSet: "+ set);

        // 3. HashMap (Key-Value 쌍 저장, 순서 X, key 중복 X)
        HashMap<String,Integer> map = new HashMap<>();

        map.put("Apple",3);
        map.put("Banana",5);
        map.put("Orange",2);
        map.put("Apple",19);

        System.out.println("HashMap"+ map);


        //key를 이용해 값 꺼내기
        System.out.println("Apple의 개수 : "+ map.get("Apple"));
    }
}
