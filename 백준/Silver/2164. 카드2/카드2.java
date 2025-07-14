import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 버리고 옮기고를 번갈아 반복하는 문제
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList<>();
        
        for(int i=1; i<=N; i++){
            q.offer(i);
        }
        
        while(q.size() > 1){
            q.poll();   //버린다
            q.add(q.poll());    //넘긴다
        }
        System.out.println(q.poll());
    }
}
