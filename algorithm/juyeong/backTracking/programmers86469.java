package algorithm.juyeong.backTracking;
import java.util.*;

public class programmers86469{

    public static void main(String args[]){
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};

        int maxH = 0;
        int maxW = 0;
        //정렬
        for(int[] size : sizes){
            int w = Math.max(size[0],size[1]);
            int h = Math.min(size[0],size[1]);

            maxW=Math.max(w,maxW);
            maxH=Math.max(h,maxH);
        }

        System.out.println(maxW*maxH);

    }
}