import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        // 카드 합 < 21, 인데 max
        // 양의 정수
        // 3장의 카드를 고르고 합이 m을 넘지 않으면서 최대한 가깝게 할것
        // 첫번째 숫자가 카드의 수, 두번째숫자가 m 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        
        int n = Integer.parseInt(st1.nextToken());
        int m = Integer.parseInt(st1.nextToken());

        Integer[] arr = new Integer[n];
        int count = n*(n-1)/2;
        Integer[] arr2 = new Integer[count];
        
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st2.nextToken());
        }
        
        int sum = 0;
        int max = 0;
        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int k=j+1; k<n; k++){
                    sum = arr[i] + arr[j] + arr[k];
                    
                    if(sum <= m && sum >= max){
                        max = sum;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
