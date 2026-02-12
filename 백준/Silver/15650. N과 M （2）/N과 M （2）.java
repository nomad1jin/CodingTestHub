import java.util.*;
import java.io.*;

public class Main {
    public static int N, M;
    public static int[] arr;
    public static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[M];
        backTracking(0,0);
        System.out.println(sb);
    }
    
    public static void backTracking(int depth, int start){
        
        if(depth == M){
            for(int result : arr){
                sb.append(result).append(" ");
            }
            sb.append("\n");
            return;
        }
        
        for(int i=start; i<N; i++){
            arr[depth] = i+1;   //i+1넣고 재귀시작도 이걸로 
            backTracking(depth+1, i+1);
        }
    }
}
