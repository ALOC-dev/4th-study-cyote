package algorithm.juyeong.DFS;
import java.util.*;

public class exercise{
    //방문 배열
    static boolean[] visited = new boolean[7];
    
    //그래프 인접 리스트
    static ArrayList<Integer>[] A = new ArrayList[7];
    
    public static void main(String args[]){

        for(int i =1 ; i<=6; i++){
            A[i]=new ArrayList<>();
        }

        A[1].add(2);
        A[1].add(3);
        A[2].add(5);
        A[2].add(6);
        A[3].add(4);
        A[4].add(6);

    }


    public static void DFS_stack(int startNode){

        Stack<Integer> stack = new Stack<>();

        stack.push(startNode);

        while(stack.isEmpty()){
            int unit =stack.pop();

            visited[unit]= true;

            for(int connectedNode : A[unit]){
                if(!visited[connectedNode]){
                    stack.push(connectedNode);
                }
            }
        }
    }

    public static void DFS_recursive(int startNode){
        if(visited[startNode]) return;

        visited[startNode]=true;

        for(int connectedNode : A[startNode]){
            if(!visited[connectedNode]){
                DFS_recursive(connectedNode);
            }
        }
    }


}