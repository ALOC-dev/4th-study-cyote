import java.util.*;

class Solution {
    public int[] solution(int []arr) {
    
        int temp = -1;
        
        Queue<Integer> q = new LinkedList<>();
        for(int num : arr){
            if(num != temp){
                q.add(num);
                temp = num;
            }
        }
        
        int size = q.size();
        int[] answer = new int[size];

        for(int i = 0 ; i < size; i++){
            answer[i] = q.poll();
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {1,1,3,3,0,1,1};
        int[] result = s.solution(arr);
        System.out.println(Arrays.toString(result));
    }
}
