import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2){
                return - Integer.compare(o1, o2);
            } 
        });
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            if(num == 0){
                if(maxHeap.isEmpty()){
                    System.out.println("0");
                } 
                else {
                    System.out.println(maxHeap.poll());
                }
            }
            else {
                maxHeap.add(num);
            }
        }
    }
}
