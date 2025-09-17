import java.util.*;
import java.io.*;

public class Main {
 
    public static void main(String[] args) throws IOException {

        //아는놈있다 1단계, 두다리건너 2단계 = 건너는 엣지의 수 
        //케빈베이컨 수는 합
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N + 1][N + 1];
        int INF = 1000001;
        
        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                if(i==j){
                    arr[i][j] = 0;
                } else {
                    arr[i][j] = INF;  //초기값 세팅
                }
            }
        }
        
         //간선 양방향 세팅
        for(int i=1; i<=M; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            arr[from][to] = arr[to][from] = 1; 
        }
        
        //플로이드 워셜 - 최단 경로 초기화
         for(int k=1; k<=N; k++){
            for(int i=1; i<=N; i++){
                for(int j=1; j<=N; j++){
                    if(arr[i][j] > arr[i][k] + arr[k][j]){
                        arr[i][j] = arr[i][k] + arr[k][j];
                    }
                }    
            }    
        }
        
        //연결 관계 계산, 케빈 베이컨 가장 작은 수를 탐색
        //가장 작은 수만 찾으면 되므로 각 노드별로 거리를 기록할 필요없음(이게 헷갈렸다)
        int res = INF;
        int idx = 0;
        
        for(int i=1; i<=N; i++){
            int total = 0;  //반복문 안에 있어야 i마다 합계가 가능함!!!!
            
            for(int j=1; j<=N; j++){
                total += arr[i][j];
            }
            
            if(total < res){
                res = total; // 최소 갱신
                idx = i;    //그때의 인덱스 
            }
        }
        
        System.out.println(idx);
    }
    

        // 엣지를 어떻게 셀 수 있을까? 아래식은 연결된 애들만 방문하는데 어떻게 다른 엣지까지 방문하지?
        // 방문 여부 기록이 중요할까? 필요없을거같음

}
