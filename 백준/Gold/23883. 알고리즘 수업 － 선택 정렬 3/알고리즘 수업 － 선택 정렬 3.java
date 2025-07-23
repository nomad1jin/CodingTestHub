import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        TreeMap<Integer, Integer> treemap = new TreeMap<>(Collections.reverseOrder());
        st = new StringTokenizer(br.readLine(), " ");
        
        for(int i=0; i<N; i++){
            int num = Integer.parseInt(st.nextToken());
            treemap.put(num, i);
            arr[i] = num;
        }
        
        int i = N-1;    //배열 범위 벗어나는 예외 주의 
        int count = 0;
        for(int maxValue : treemap.keySet()){
            int maxIndex = treemap.get(maxValue);
            
            // i번째 데이터가 최대가 아니라면 
            if(arr[i] != maxValue){
                //swap해야하는데
                //count증가, print, swap순으로 진행해야됨
                count++;
                if(count == K){
                    sb.append(arr[i]).append(" ").append(maxValue);
                    System.out.print(sb);
                    return; //답을 출력하면 더이상 반복문을 돌릴 필요 없음
                }
            }
            //트리맵과 배열 값 swap (arr[i]가 더 큼)
            treemap.put(arr[i], maxIndex);    
            arr[maxIndex] = arr[i];
            
            i--;
        }
        //count가 K에 도달하지 못했을 경우 (작을 경우)
        System.out.println("-1");
    }
}
