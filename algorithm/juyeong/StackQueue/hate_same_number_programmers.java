package algorithm.juyeong.StackQueue;
import java.util.*;

public class hate_same_number_programmers {
    public static void main(String args[]){

        int[] answer = {};

        int[] arr= {1,1,3,3,0,1,1};

        Stack<Integer> st = new Stack<>();

        for(int number : arr){
            if(st.isEmpty()){
                st.push(number);
                continue;
            }

            if(st.peek()!=number){
                st.push(number);
            }
        }
        answer=st.stream().mapToInt(Integer :: intValue).toArray();

        System.out.println(Arrays.toString(answer));

    }
}
