import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        
        System.out.println(multiple(A, B, C));
    }
    
    public static long multiple(int a, int b, int c){
        
        if(b == 0){
            return 1;
        }
        long n = multiple(a, b/2, c);
        // a10 => a5 * a5
        // a11 => a5 * a5 * a
        if(b % 2 == 0){
            return n * n % c;
        } else {
            return (n * n % c) * a % c;
        }
    }
}
