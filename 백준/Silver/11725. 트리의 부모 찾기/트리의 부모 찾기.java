import java.util.*;
import java.io.*;

public class Main {
    
    public static ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
    public static int N;
    public static int[] parent;
    public static boolean[] visited;
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 노드의 개수 
        N = Integer.parseInt(br.readLine());
        parent = new int[N+1];
        visited = new boolean[N+1];
        
        //0부터 시작하지만 안씀!! 1~N
        for(int i=0; i<=N; i++){
            arr.add(new ArrayList<>());
        }
        
        // 트리는 간선이 N-1개
        for(int i=0; i<N-1; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr.get(x).add(y);
            arr.get(y).add(x);
        }
        
        dfs(1); //1부터 시작 
        
        for(int i=2; i<parent.length; i++){
            System.out.println(parent[i]);
        }
    }
    
    public static void dfs(int node){
        
        visited[node] = true;
        
        for(int i : arr.get(node)){
            if(!visited[i]){
                parent[i] = node;
                dfs(i);
            }
        }
        
    }
}
