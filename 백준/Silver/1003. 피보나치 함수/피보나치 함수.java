import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
   
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        int[][] dp = new int[41][2];    //0~40이라서 41개, 0과1 두개 
        
        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;
        
        for(int j=2; j<41; j++){
            dp[j][0] = dp[j-1][0] + dp[j-2][0]; //0번째
            dp[j][1] = dp[j-1][1] + dp[j-2][1]; //1번째. fibo합이 아니라 count누적!!
        }
            
        for(int i=0; i<N; i++){
            int M = Integer.parseInt(br.readLine());
            
            sb.append(dp[M][0]).append(" ").append(dp[M][1]).append("\n");
        }
        System.out.print(sb);
    }
}
