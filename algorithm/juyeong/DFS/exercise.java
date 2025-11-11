package algorithm.juyeong.DFS;
import java.util.*;

public class exercise {
    //인접리스트 초기화 방식
    
    //방문배열
    //특정노드 방문시 visited[node번호]=true와 같이 두번 방문하는 것을 방지
    static boolean[] visited = new boolean[7];
    //그래프 인접리스트
    //ArrayList를 요소로 갖는 배열을 선언
    static ArrayList<Integer>[] A = new ArrayList[7]; //ArrayList타입 배열
    //탐색 순서 기록용 리스트
    //dfs함수가 노드를 방문할떄마다 여기에 노드를 추가해서 최종 탐색 순서를 main함수에서 출력
    static ArrayList<Integer> procedure = new ArrayList<>();//탐색 순서 list
    

    public static void main(String args[]){
        //인접리스트 초기화
        //1번~6번 연결리스트 각각 선언
        for(int i=1;i<=6;i++){
            A[i]=new ArrayList<>();
        }
        A[1].add(2);
        A[1].add(3);
        A[2].add(5);
        A[2].add(6);
        A[3].add(4);
        A[4].add(6);

        //1번 노드에서 DFS 실행
        DFS_stack(1);

        System.out.println(procedure.toString());

    }
    //구현1 : 스택 방식
    //arg
    public static void DFS_stack(int v){
        Stack<Integer> stack = new Stack<>();
        //1. 시작 노드 v를 스택에 넣음
        stack.push(v);

        while(!stack.isEmpty()){//2. 스택이 빌 때까지 반복하기
            int currentNode = stack.pop();// 3. 스택에서 노드를 하나 꺼냄

            visited[currentNode]=true;//4. 스택에서 꺼낸 시점에 방문처리
            procedure.add(currentNode);//과정기록

            for(int i : A[currentNode]){//5. 꺼낸 노드와 연결된 이웃들을 탐색
                if(!visited[i]){//6.아직 방문을 하지 않았다면
                    stack.push(i);
                }
            }
        }

    }


    //재귀방식
    static void DFS_recursive(int v){
        if(visited[v]) return;//방문했을 때에는 즉시 종료

        visited[v]= true;
        procedure.add(v);

        for(int i : A[v]){
            if(!visited[i]){
                DFS_recursive(i);
            }
        }
    }










}
