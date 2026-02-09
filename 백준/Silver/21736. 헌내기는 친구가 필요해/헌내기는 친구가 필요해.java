import java.util.*;
import java.io.*;

public class Main {
    public static char[][] arr;
    public static boolean[][] visited;
    public static int N, M, count;
    public static void main(String[] args) throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new char[N][M];
        visited = new boolean[N][M];
        
        for(int i=0; i<N; i++){
            String str = br.readLine();            
            for(int j=0; j<M; j++){
                arr[i][j] = str.charAt(j);
            }            
        }
        bfs();
        if(count == 0){
            System.out.println("TT");
        } else {
            System.out.println(count);
        }
        
    }
    
    public static void bfs(){
        Queue<int[]> q = new LinkedList<>();
        int[] dx = {-1,0,1,0};
        int[] dy = {0,1,0,-1};
        
        for(int i=0; i<N; i++){         
            for(int j=0; j<M; j++){
                if(arr[i][j] == 'I'){
                    q.add(new int[]{i,j});
                    visited[i][j] = true;
                }
            }            
        }
        
        while(!q.isEmpty()){
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];
                       
            for(int i=0; i<4; i++){    
                int nx = x + dx[i];
                int ny = y + dy[i];     
                if(nx>=0 && ny>=0 && nx<N && ny<M 
                    && arr[nx][ny]!='X' && !visited[nx][ny]){
                    
                    visited[nx][ny] = true;                    
                    if(arr[nx][ny]=='P'){
                        count++;                  
                    }
                    q.add(new int[]{nx,ny});
                }            
            }
        }
    }
}
