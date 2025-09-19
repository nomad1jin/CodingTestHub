import java.io.*;
import java.util.*;

public class Main{
    
    public static int arr[][];
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<n; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        // 플로이드 워셜은 최단경로 구할 때 사용하지만 노드를 타고간다 이런 문제에서도 사용 가능
        // i->j로 갈건데, 중간에 k를 경유 i->k->j
        for(int k=0; k<n; k++){
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    if(arr[i][k]==1 && arr[k][j]==1){
                        //둘다 1이므로 갈 수있고 따라서 arr[i][j]==1
                        arr[i][j] = 1;
                    }
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                sb.append(arr[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}