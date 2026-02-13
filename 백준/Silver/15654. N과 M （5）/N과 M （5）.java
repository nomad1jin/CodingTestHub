import java.util.*;
import java.io.*;

public class Main {
    
    public static int N, M;
    public static int[] arr;
    public static boolean[] visited;
    public static int[] input;
    public static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());   //자연수 개수
        M = Integer.parseInt(st.nextToken());   //수열 수
        arr = new int[M];
        visited = new boolean[N];
        input = new int[N];
        
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++){
            input[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(input);
        
        backTracking(0);
        System.out.println(sb);
    }
    
    public static void backTracking(int depth){
        
        if(depth == M){          
            for(int a : arr) {
                sb.append(a).append(" ");
            }
            sb.append("\n");
            return;
        }
        
        
        for(int i=0; i<N; i++) {
            if(!visited[i]){
                visited[i] = true;
                arr[depth] = input[i];
                backTracking(depth+1);  
                visited[i] = false; 
            }  
        }
    }
}
