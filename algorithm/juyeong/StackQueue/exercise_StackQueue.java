package algorithm.juyeong.StackQueue;

import java.util.*;

public class exercise_StackQueue {
    public static void main(String args[]){

        //스택 선언
        Stack<Integer> st = new Stack<>();
        //큐 선언
        Queue<Integer> q = new LinkedList<>();

        st.push(0);
        st.push(0);
        st.push(1);
        st.push(2);

        q.offer(0);
        q.offer(0);
        q.offer(1);
        q.offer(2);

        System.out.println("===Stack===");
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }

        System.out.println("===Queue===");
        while(!q.isEmpty()){
            System.out.println(q.poll());
        }
    }
}
