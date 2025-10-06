package algorithm.juyeong.StackQueue;

import java.util.Arrays;

public class correctParentheses {
    public static void main(String args[]){
        String s="()()";
        boolean answer = true;

        String[] array = s.split("");
        int count = 0;
        for(String unit : array){
            if(unit.equals("(")){
                count+=1;
            }
            if(unit.equals(")")){
                count-=1;
            }
            if(count <0){
                answer = false;
            }
        }

        if(count !=0){
            answer = false;
        }

        // System.out.println(Arrays.toString(array));
        System.out.println(answer);


        
    }
}