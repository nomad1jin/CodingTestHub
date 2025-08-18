import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 1x2, 2x1 크기를 어떻게 정의할 것인가
        // 정의하지않아도 된다. n=1, 2, 3, 4 ~ 일때의 경우를 떠올려서 점화식으로 만들어야한다. 뭔가 확통 경우의 수 세는 느낌 
        // n=1 -> 1
        // n=2 -> 2
        // n=3 -> 3
        // n=4 -> 5
        // n=5 -> 8
        // n=6 -> 13
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n+1];  //n이라고 하면 0~n-1까지 할당함 
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2; i<=n; i++){
            dp[i] = (dp[i-1] + dp[i-2]) % 10007;
        }
        System.out.println(dp[n]);
    }
}
