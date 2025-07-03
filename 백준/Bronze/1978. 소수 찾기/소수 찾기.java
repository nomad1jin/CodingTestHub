import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());   //첫 줄 개수
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");   //두번째줄
        int count = 0;
        
        
        for(int i = 0; i<n; i++){
            int k = Integer.parseInt(st.nextToken());
            boolean isPrime = true;
            
            if(k == 1){
                continue;
            }
            
            for(int j=2; j<k; j++){
                if(k % j == 0){
                    isPrime = false;
                }
            }    
            if(isPrime){
                count++;
            }
        }
        System.out.println(count);
        br.close();
    }
}
