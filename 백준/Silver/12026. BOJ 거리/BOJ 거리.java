import java.util.*;
import java.io.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) throws IOException {
        // 왔던 길을 돌아가지 않고 번호가 증가하는 방향으로 점프
        // k칸 점프하는데에 k*k, BOJ를 외쳐야함 (BOJ를 한번이라도 완성시켜야하나봄, 아님 -1)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[] arr = new char[n];
        int[] dp = new int[n];
        
        int INF = 10000000;
        Arrays.fill(dp, INF);   //큰 값으로 채워두고 비교하기
        
        String str = br.readLine();
        arr = str.toCharArray();
        
        dp[0] = 0;
        for(int i=0; i<n; i++){
            if(dp[i] == INF) continue;
            
            if(arr[i] == 'B'){
                for(int j=1; j<n; j++){
                    if(arr[j] == 'O'){
                        int value = dp[i] + (j - i) * (j - i);
                        dp[j] = Math.min(dp[j], value); //min으로 계속 비교해야하는이유: OOO같이 겹치는 값때문에
                    }
                }
            } 
            //은근 헷갈리는데 char은 equals가 아니다 
            else if(arr[i] == 'O'){
                for(int j=1; j<n; j++){
                    if(arr[j] == 'J'){
                        int value = dp[i] + (j - i) * (j - i);
                        dp[j] = Math.min(dp[j], value);
                    }
                }
            } 
            else {
                for(int j=1; j<n; j++){
                    if(arr[j] == 'B'){
                        int value = dp[i] + (j - i) * (j - i);
                        dp[j] = Math.min(dp[j], value);
                    }
                }
            } 
            
        }
        System.out.println(dp[n-1] == INF ? -1 : dp[n-1]);
    }
}
