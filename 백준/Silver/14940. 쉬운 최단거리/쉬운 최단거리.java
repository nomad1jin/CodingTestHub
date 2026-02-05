import java.util.*;
import java.io.*;

public class Main {
    
    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, 1, 0, -1};
    public static boolean[][] visited;
    public static int[][] arr;
    public static int n, m;
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n+1][m+1];
        visited = new boolean[n][m];
        
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<m; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        bfs(); 
        
        //1인데 방문하지 않음 = 도달할 수 없는 위치 -1
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(arr[i][j]==1 && !visited[i][j]){
                    arr[i][j] = -1;
                }    
            }
        }
        
        //출력
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                sb.append(arr[i][j]).append(" ");   
            }
            sb.append("\n");
        }
        System.out.println(sb);
        
    }
    
    public static void bfs() {
        Queue<int[]> q = new LinkedList<>();
        //2인 지점부터 시작!!!!
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 2) {
                    q.add(new int[]{i, j});
                    visited[i][j] = true;
                    arr[i][j] = 0;    //중요!!! 이걸 추가하지 않으면 2부터 +1씩 출력돼. 
                }
            }
        }
        
        while(!q.isEmpty()){
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];
            
            //x,y는 시작점이고 nx,ny는 갈수있는 방향의 좌표 
            for(int i=0; i<4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if(nx>=0 && ny>=0 && nx<n && ny<m){
                    if(arr[nx][ny]==1 && !visited[nx][ny]){
                        visited[nx][ny] = true;
                        // 거리 계산
                        arr[nx][ny] = arr[x][y] + 1;
                          
                        q.offer(new int[]{nx, ny});
                    }
                }
            }
        }
    }
}
