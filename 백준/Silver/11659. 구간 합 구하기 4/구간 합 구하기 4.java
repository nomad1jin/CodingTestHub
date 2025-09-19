import java.util.*;;
import java.io.*;

public class Main{
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[n + 1];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=1; i<=n; i++){
            // 누적합!!!! 
            // arr[1] = 0 + 5
            // arr[2] = 5 + 4 = 9
            // arr[3] = 9 + 3 = 12
            // arr[4] = 12 + 2 = 14
            arr[i] = arr[i-1] + Integer.parseInt(st.nextToken());
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            // 4+3+2 = 9 
            // arr[4] - arr[1] = 9 
            sb.append(arr[to] - arr[from-1]).append("\n");
        }
        System.out.println(sb);
    }
}