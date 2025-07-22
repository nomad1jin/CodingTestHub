import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        for(int i=0; i<N; i++){
            int n = Integer.parseInt(st.nextToken());
            hashmap.put(n, 1);
        }
        
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<M; i++){
            int m = Integer.parseInt(st2.nextToken());
            if(hashmap.containsKey(m)){
                sb.append("1 ");
            } else {
                sb.append("0 ");
            }
        }
        System.out.print(sb);
    }
}
