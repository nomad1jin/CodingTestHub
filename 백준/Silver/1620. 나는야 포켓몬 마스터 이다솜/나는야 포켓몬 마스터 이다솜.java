import java.util.*;
import java.io.*;

public class Main {
    
    public static boolean isNumeric(String str){
        return str.matches("\\d+");  //숫자인 경우 true
    }
    
    public static void main(String[] args) throws IOException {
        // map을 하면 되지않나? 
        // 첫줄에 포켓몬의 개수 N, 문제의 개수 M
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        HashMap<String, Integer> map = new HashMap<>();
        String[] arr = new String[N+1];
        
        for(int i=1; i<=N; i++){
            String str = br.readLine();
            map.put(str, i);

            arr[i] = str;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=1; i<=M; i++){
            String str2 = br.readLine();
            boolean numeric = isNumeric(str2);
            
            if(numeric){
                //숫자면 숫자에 해당하는 값을 리턴
                sb.append(arr[Integer.parseInt(str2)]).append("\n");
                // sb.append(map.get(Integer.parseInt(str2))).append("\n");
            } else {    //string이면 숫자를 뽑야함 
                // index, string 순으로 map을 정의해서 한참헤맸다.
                // <String, Integer>로 정의한다면 쉽게 풀 수 있는 문제였다. !!!!!!
                sb.append(map.get(str2)).append("\n");
            }
        }
        System.out.print(sb);
    }
}
