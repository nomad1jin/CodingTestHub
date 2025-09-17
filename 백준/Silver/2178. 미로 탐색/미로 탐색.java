import java.util.*;
import java.io.*;

public class Main {

    public static int[] dx = {-1, 0, 1, 0};
    public static int[] dy = {0, 1, 0, -1};
    public static int[][] arr;
    public static boolean[][] visited;
    public static int n, m;
        
    public static void main(String[] args) throws IOException {
        // 미로 최단거리 dfs? bfs?
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        arr = new int[n][m];
        visited = new boolean[n][m];
        for(int i=0; i<n; i++){
            String line = br.readLine();
            for(int j=0; j<line.length(); j++){
                arr[i][j] = line.charAt(j) - '0';
            }
        }
        
        bfs();
    }
    
    public static void bfs(){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{0,0});
        visited[0][0] = true;
        arr[0][0] = 1; //미로 시작
        
        while(!q.isEmpty()){
            int[] cur = q.poll();   //배열로 꺼내기, 인덱스 유의
            int x = cur[0];
            int y = cur[1];
            
            for(int i=0; i<4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if(nx>=0 && ny>=0 && nx<n && ny<m){
                    if(arr[nx][ny] == 1 && !visited[nx][ny]){   //방문 안 했던 1인 길을 가자 
                        visited[nx][ny] = true;     //위치를 갱신
                        arr[nx][ny] = arr[x][y] + 1;
                        q.offer(new int[]{nx, ny});     //큐에넣어야 이전값으로 또 꺼내쓸 수 있따
                        
                    }
                }
            }
            
        }
        System.out.println(arr[n-1][m-1]);    //미로 마지막놈 출력
        
    }
}
