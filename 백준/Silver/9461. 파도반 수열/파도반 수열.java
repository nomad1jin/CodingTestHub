import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for(int j=0; j<T; j++){
            
            int N = Integer.parseInt(br.readLine());
            if((N==1 || N==2) || N==3) {
                System.out.println(1);
                continue;
            }
        
            long[] dp = new long[N+1];
            dp[0] = 0;
            dp[1] = 1;
            dp[2] = 1; //이렇게 선언했는데 만약 N=1이 들어오면 배열범위 초과! 위에 방지 코드 추가 
            
            for(int i=3; i<=N; i++){
                dp[i] = dp[i-2] + dp[i-3];
            }
            System.out.println(dp[N]);
        }
    }
}
