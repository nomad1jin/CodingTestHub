import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());    //의상의 수
 
        for(int i=0; i<n; i++){
            
            int m = Integer.parseInt(br.readLine());    //의상 이름과 종류
            Map<String, Integer> map = new HashMap<>(); //안에서 초기화 
            
            for(int j=0; j<m; j++){
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                st.nextToken();     //의상 이름은 사용 안 함 
                String type = st.nextToken();
                int count = map.getOrDefault(type, 0);  //type이 존재하면 값을, 없으면 0 리턴
                map.put(type, count + 1);  
            }
            
            //map.values()하면 아이웨어1, 헤드기어2 수가 나옴
            //의상 종류별 개수 +1 (안입는 경우도 있기 때문)
            int result = 1;
            for(int Count : map.values()){
                result *= (Count+1);
            }
            //전체에서 -1 (아무것도 안 입는 경우)
            System.out.println(result - 1);
        }
    }
}
