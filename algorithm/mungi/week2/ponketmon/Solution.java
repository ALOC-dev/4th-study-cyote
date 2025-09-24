import java.util.HashMap;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, 1);
        }

        answer = Math.min(map.size(), nums.length / 2);
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {3, 1, 2, 3};
        System.out.println(s.solution(nums));
    }
}