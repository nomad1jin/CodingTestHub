import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine(), " ");
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        
        //n개를 만들수있는 랜선의 최대 길이
        //802 -> 4, 743 -> 3, 457 -> 2, 539 -> 2
        int[] arr = new int[k];
        int max = 0;
        for(int i=0; i<k; i++){
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, arr[i]);
        }
        
        // Arrays.sort(arr);
        
        long start = 1;
        long end = max;
        long result = 0;
        while(start <= end){
            
            long mid = (start + end) / 2;    //랜선 길이가 2^31-1이라 long으로 하는게 
            long total = 0;  //total 반드시 초기화!!! 
            for(int i=0; i<k; i++){
                total += arr[i] / mid;
            }
            if(total >= n){
                //많이 잘렸다, 개수가 많다... mid가 작으므로 크게  start = mid+1
                result = mid;
                start = mid + 1;
            } else {
                // mid가 크고. 개수가 적다.. mid를 작게 설정 
                end = mid - 1;
            }
        }
        System.out.println(result);
    }
}
