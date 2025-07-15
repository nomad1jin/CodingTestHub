import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<N; i++){
            //키에 해당 숫자, 값에 숫자의 개수
            int num = Integer.parseInt(st.nextToken());
            if(map.containsKey(num)){
                int value = map.get(num);
                map.put(num, value+1);  //++value로 해도 통과. 증가된 값을 저장 
            } else {
                map.put(num, 1);
            }
            
        }
        
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        
        for(int i=0; i<M; i++){
            int number = Integer.parseInt(st2.nextToken());
            if(map.containsKey(number)){
                sb.append(map.get(number)).append(" ");
            } else {
                sb.append("0 ");
            }
        }
        
        System.out.println(sb);
    }
}
