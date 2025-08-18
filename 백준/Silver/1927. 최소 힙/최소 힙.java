import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            if(num == 0){
                //0이면 배열에서 가장 작은 값 출력
                if(minHeap.isEmpty()){
                    System.out.println("0");
                } else {
                    System.out.println(minHeap.poll());
                }
            } 
            else {
                //자연수라면 배열에 값을 추가 
                minHeap.add(num);
            }
        }
    }
}
