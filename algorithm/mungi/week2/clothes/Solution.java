import java.util.Collection;
import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();

        for (String[] clothesInfo : clothes){
            String type = clothesInfo[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }

        Collection<Integer> values = map.values();

        for (int temp : values) {
            answer *= (temp + 1);
        }

        return answer - 1;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(s.solution(clothes));
    }
}