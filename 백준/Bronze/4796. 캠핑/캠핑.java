import java.util.*;
import java.io.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) throws IOException {
        //8일동안 5일 사용 가능
        //20일 휴가니까 L*P
        //if(V-(L*P) < L) V다 사용가능
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 1;
        
        while(true){
            
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int days = 0;
            int L = Integer.parseInt(st.nextToken());
            int P = Integer.parseInt(st.nextToken()); 
            int V = Integer.parseInt(st.nextToken());
            
            if(L == 0 && P == 0 && V == 0){
                break;
            }
            
            days = (V / P) * L + Math.min(L, (V % P));
            System.out.println("Case " + count + ": " + days);
            count++;
        }
    }
}
