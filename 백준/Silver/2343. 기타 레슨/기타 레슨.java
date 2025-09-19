import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());    // 블루레이의 수
        int[] arr = new int[n]; 
        int start = 0;
        int end = 0;
        
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken()); 
            end += arr[i];    
            start = Math.max(arr[i], start);
        }
        
        while(start <= end){
            
            int count = 1;
            int mid = (start + end) / 2;     //mid 크기로 블루레이 m개 이하로 담을 수 있나??
            int total = 0;
            
            for(int i=0; i<n; i++){
                //현재 블루레이에 넣었는데 만약 mid보다 크면 새 블루레이에 담아야함
                if (total + arr[i] > mid){
                    count++;
                    total = 0;    //사실 이 sum초기화가 진짜 핵심!!!!!!!!!!
                }
                total += arr[i];
            }
            if(count <= m){    //필요한 블루레이 개수가 m이하면 mid용량을 충분 
                end = mid - 1;
            } else {
               start = mid + 1;
            }
            
        }
        System.out.println(start);
    }
}
