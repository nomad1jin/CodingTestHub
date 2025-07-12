import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        // ( 는 push하고 )를 만나면 () pop할것. 그리고 push는 끝났는데 스택에 남아있다면 NO
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] str = new String[N];
    
        for(int i=0; i<N; i++){
            str[i] = br.readLine();
        }
        
        for(String s : str){
            
            String[] line = s.split("");
            Stack<String> stack = new Stack<>();
            
            for(int i=0; i<line.length; i++){
                if(line[i].equals("(")){
                    stack.push(line[i]);
                    
                } else {
                    //스택을 pop하기 전에 반드시 비었는지 확인하기!!! EmptyStackException
                    // ")"를 만나면 "("를 pop
                    if(!stack.isEmpty() && stack.peek().equals("(")){
                        if(!stack.isEmpty()){
                            stack.pop();
                        } 
                    } else {    //"("가 아니면 push()
                        stack.push(line[i]);
                    }
                    
                }
            }
            
            if(stack.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
