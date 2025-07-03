import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Scanner sc = new Scanner(System.in);
        // int N = sc.nextInt();
        // for(int i=0; i<N; i++){
            // int a = sc.nextInt();
            // int b = sc.nextInt();
            // System.out.println(a+b);
        // }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
