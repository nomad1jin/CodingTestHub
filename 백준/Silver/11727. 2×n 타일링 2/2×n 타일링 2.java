import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];
        
        // 세개의모양
        dp[0] = 0;
        dp[1] = 1;
        
        if(n>=2) {
            dp[2] = 3;
        }
        // dp[3] = 5
        // dp[4] = 11
        
        for(int i=3; i<=n; i++){
            dp[i] = (dp[i-1] + 2 * dp[i-2]) % 10007;
        }
        System.out.println(dp[n]);
    }
}
