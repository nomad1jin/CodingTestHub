import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // R-순서 뒤집기, D-첫번째 수 버리기
        // 배열이 비어있는데 버리면 에러
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());
        for (int t = 0; t < T; t++) {
            Deque<Integer> deque = new ArrayDeque<>();
            String method = br.readLine();
            int size = Integer.parseInt(br.readLine());
            
            String inputArr = br.readLine();
            if(size > 0){
                String[] arr = inputArr.substring(1, inputArr.length() - 1).split(",");
                for(String num : arr){
                    deque.addLast(Integer.parseInt(num));
                }
            }
            
            
            boolean isReversed = false;
            boolean error = false;
            
            for(char c : method.toCharArray()){
                // 뒤집는 연산일 경우, isReversed 
                if(c == 'R') {
                    isReversed = !isReversed;   //true말고 이렇게 !반대로
                } else {
                    if(deque.isEmpty()){      
                        error = true;
                        break;
                    }
                    
                    //역방향이면 뒤에서 제거, 정방향이면 앞에서 제거 
                    if(isReversed){
                        deque.removeLast();
                    } else {
                        deque.removeFirst();
                    }
                }
            }
            if(error) {
                sb.append("error").append("\n");
            } else {
                sb.append("[");
                int count = 0; //,를 마지막에 출력안하기위함


                while (!deque.isEmpty()) {
                    if (isReversed) {
                        sb.append(deque.removeLast());
                    } else {
                        sb.append(deque.removeFirst());
                    }

                    if (!deque.isEmpty()) {
                        sb.append(",");
                    }
                }

                sb.append("]");
                sb.append("\n");
            }
        }        
        System.out.println(sb);
    }
}
