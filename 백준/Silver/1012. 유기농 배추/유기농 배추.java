import java.util.*;
import java.io.*;

public class Main {
    
    public static int[] dx = {-1, 0, 1, 0};   //12시부터 시계방향 
    public static int[] dy = {0, 1, 0, -1};
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    public static boolean[][] visited;
    public static int N = 0;
    public static int M = 0;
    public static int[][] arr;
    
    public static void dfs(int x, int y){
        visited[x][y] = true;
        
        //이동방향 4방향 
        for(int d=0; d<4; d++){
            int nx = x + dx[d];
            int ny = y + dy[d];
            if(nx >= 0 && ny >= 0 && nx < N && ny < M){
                //가로M x 세로N y
                if(arr[nx][ny] == 1 && !visited[nx][ny]){
                    dfs(nx, ny);
                }
            }
        }
    
    }
    
    public static void main(String[] args) throws IOException {
        //T
        //M가로 N세로 K배추심어진 위치 개수
        //배추의 위치 X, Y
        //일단 배추위치를 심는다.
        //지렁이가 이동하고, 거기가 배추1이면 dfs()를 한다.
        //이때 지렁이는 배열 전체를 돌아야하는가? 그리고 지렁이 count를 어떻게 할 것인가. 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        int count = 0;
        
        for(int i=0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            
            //테스트 케이스마다 초기화 
            // 행,열 세로,가로 순으로 반드시 !!!!
            arr = new int[N][M];
            visited = new boolean[N][M];

            for(int c=0; c<M; c++){
                for(int r=0; r<N; r++){
                    arr[r][c] = 0;
                }
            }
            
            for(int j=0; j<K; j++){
                //순서가 가로, 세로 => 열y, 행x
                StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
                int c = Integer.parseInt(st2.nextToken());
                int r = Integer.parseInt(st2.nextToken());
                arr[r][c] = 1;
            }
            
            for(int c=0; c<M; c++){
                for(int r=0; r<N; r++){
                    if(arr[r][c] == 1 && !visited[r][c]){
                        dfs(r, c);
                        count++;
                    }
                }
            }
            System.out.println(count);
            count = 0;
        }
    }
}
