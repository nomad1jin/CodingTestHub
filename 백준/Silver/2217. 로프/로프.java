import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        //각각의 로프에는 모두 고르게 중량이 걸린다
        //근데 중량을 모름
        //10 + 10  
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] arr = new int[N];
        int max = 0;
        
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();  
        }
        Arrays.sort(arr);
        
        for(int i=0; i<N; i++){
            int maxWeight = arr[i] * (N-i);
            max = Math.max(max, maxWeight);
        }
        System.out.println(max);
    }
}
