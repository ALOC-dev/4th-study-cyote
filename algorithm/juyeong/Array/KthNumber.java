package algorithm.juyeong.Array;
import java.util.*;

public class KthNumber {
    public static void main(String args[]){
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3},{4, 4, 1},{1, 7, 3}};
        ArrayList<Integer> answer = new ArrayList<>();

        for(int[] command : commands){
            int i = command[0];
            int j = command[1];
            int index = command[2];
            

            int[] sliceArray = Arrays.copyOfRange(array,i-1,j); //i부터~j-1까지
            Arrays.sort(sliceArray);
            answer.add(sliceArray[index-1]);
        }
        int[] result = answer.stream().mapToInt(Integer::intValue).toArray();

        System.out.println(Arrays.toString(result));

    }
}
