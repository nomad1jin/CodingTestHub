import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 스택이냐 큐냐 배열이냐 리스트냐 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        HashSet<Integer> h = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<M; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String n = st.nextToken();
            switch (n) {
                case "add": 
                    int num = Integer.parseInt(st.nextToken());
                    h.add(num);
                    break;                    
                    
                case "remove":
                    h.remove(Integer.parseInt(st.nextToken()));
                    break; 
                    
                case "check":
                    int check = Integer.parseInt(st.nextToken());
                    if(h.contains(check)){
                        sb.append("1\n");
                        break;
                    } else {
                        sb.append("0\n");
                        break;
                    }
                    
                case "toggle":
                    int toggle = Integer.parseInt(st.nextToken());
                    if(h.contains(toggle)){
                        h.remove(toggle);
                        break;
                    } else {
                        h.add(toggle);
                        break;
                    }
                
                case "all":
                    h.clear();
                    for(int j=1; j<=20; j++){
                        h.add(j);
                    }
                    break;
                
                case "empty":
                    h.clear();
                    break;
            }
        }
        System.out.print(sb);
    }
}
