import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        //스택
        //0이 나오면 stack.peek(), 그리고 pop()
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> s = new Stack<>();
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        
        for(int i=0; i<N; i++){
            int num = Integer.parseInt(br.readLine());
            if(num == 0){
                sum -= s.peek();
                if(!s.isEmpty()) {
                    s.pop();
                } 
            } else {
                s.push(num); 
                sum += num;
            }
        }
        System.out.println(sum);
    }
}
