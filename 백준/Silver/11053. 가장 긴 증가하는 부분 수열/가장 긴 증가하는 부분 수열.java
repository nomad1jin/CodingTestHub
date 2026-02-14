import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N+1];
        int[] dp = new int[N+1];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for(int i=1; i<=N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int max = 1;    //dp[2]부터 돌기때문에 예제가 하나만 있으면 max는 0 이라서 틀림. 반례를 잘 생각할것
        dp[1] = 1;    
        for(int i=2; i<=N; i++){
            dp[i] = 1;  //아무것도 없어도 최소 자기 자신은 가능 
            
            for(int j=1; j<i; j++) {
                if(arr[j] < arr[i]){
                    dp[i] = Math.max(dp[j] + 1, dp[i]); 
                }                
            }  
            max = Math.max(dp[i], max);      
        }
        
        System.out.println(max);
    }
}
