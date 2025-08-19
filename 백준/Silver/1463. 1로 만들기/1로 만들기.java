import java.util.*;
import java.io.*;
import java.lang.Math;

public class Main {
    
    static int[] dp;
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        dp = new int[n + 1];
        int INF = -1;
        Arrays.fill(dp, INF);
        
        dp[0] = 0;
        dp[1] = 0;
        
        //아까 풀이 Top-down은 입력 값 n이 커질 때 재귀 호출이 엄청 많아져서 시간 초과가 날 수 있다.
        //Bottom-up
        for(int i=2; i<=n; i++){
            dp[i] = dp[i - 1] + 1;
            if(i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            } 
            // 아래도 if로 하는 이유는 6의 배수처럼 2와 3으로 나눌 수 있는 값은 둘다 해야함. else no no 
            if(i % 3 == 0){
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }
        System.out.println(dp[n]);
    }
}
