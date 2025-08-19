import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] dp;
        
        for(int i=0; i<t; i++){
            int n = Integer.parseInt(br.readLine());
            dp = new int[11];
            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 4;
            
            //잘 계산을 해보면 i=4부터는 이전 세개의 합이 개수가 됨
            for(int j=4; j<=n; j++){
                dp[j] = dp[j - 1] + dp[j - 2] + dp[j - 3];
            } 
            System.out.println(dp[n]);
        }
    }
}
