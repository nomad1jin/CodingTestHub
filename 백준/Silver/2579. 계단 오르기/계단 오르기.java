import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int[] stair = new int[n + 2];
        int[] dp = new int[n + 2];
        for(int i=1; i<=n; i++){
            st = new StringTokenizer(br.readLine(), " ");
            stair[i] = Integer.parseInt(st.nextToken());
        }
        
        // 일단 시작부터 두번째 계단까지의 최대를 구하기
        dp[1] = stair[1];
        // arr[2] 보단 한칸씩 가는게 더 크니까 당연히 arr[1] + arr[2]가 더 큼
        dp[2] = stair[1] + stair[2];
        for(int i=3; i<=n; i++){
            dp[i] = Math.max(dp[i-3]+stair[i-1] , dp[i-2]) + stair[i];
        }
        System.out.println(dp[n]);
    }
}