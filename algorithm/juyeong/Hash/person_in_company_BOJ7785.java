package algorithm.juyeong.Hash;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class person_in_company_BOJ7785 {
    public static void main(String args[]) throws IOException{

        //입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int logCount = Integer.parseInt(br.readLine());

        //Hash
        HashMap<String,String> map = new HashMap<>();

        for(int i = 0;i<logCount;i++){
            StringTokenizer log = new StringTokenizer(br.readLine());
            String name = log.nextToken();
            String commute = log.nextToken();
            
            map.put(name, commute);
        }

        // 출근한 사람만 Array에 넣기
        ArrayList<String> enterList = new ArrayList<>(); 

        for(Map.Entry<String,String> entry : map.entrySet()){
            String name = entry.getKey();
            String commute = entry.getValue();

            if(commute.equals("enter")){
                enterList.add(name);
            }
        }
        //정렬
        Collections.sort(enterList,Collections.reverseOrder());
        
        //출력
        for(int i = 0; i< enterList.size();i++){
            System.out.println(enterList.get(i));
        }

    }
}