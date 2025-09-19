import java.util.*;
import java.io.*;

public class Main {
    public static int n;
    public static int sum = 0;
    public static int[] arr;
    public static int amount;
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new int[n];
        
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int max = 0;
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            sum += arr[i];
            max = Math.max(max, arr[i]);
        }
        
        amount = Integer.parseInt(br.readLine());
        //배정될 수 있으면 요청한 금액 그대로, 아니면 특정한 정수 상한액을 계산(이진탐색으로)
        if(sum > amount){
            System.out.println(binarySearch(0, amount));
        } else {
            System.out.println(max);
        }
    }
    
    public static int binarySearch(int start, int end){

        while(start <= end){
            
            int budget = 0;
            int mid = (start + end) / 2;    //242정도
            
            for(int i=0; i<n; i++){
                if(arr[i] > mid){
                    budget += mid;    //mid보다 크면 mid 금액을 산정
                } else {
                    budget += arr[i];    //mid보다 작으면 arr 금액
                }
            }
            
            // 출력하고자 하는 거 budget 
            if(budget <= amount){   
                start = mid + 1;    //budget이 작으므로 스타트 늘리기   
            } else {
                end = mid - 1;    //budget이 커서 end를 줄이기 
            }      
        }
        return end;
    }
}