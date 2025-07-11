import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split("-");
        int SUM = 0;
        // Stack<String> stack = new Stack<>();
        // ArrayList<Integer> list = new ArrayList<>();
        // - - && + + && + -는 괄호 필요없
        // - + 괄호 
        
        for(int i=0; i<str.length; i++){
            int sum = 0;
            String[] plus = str[i].split("\\+");   
            //split()해서 String[]에 넣는 걸 잊지마
            //그냥 +로 하면 안되고 \\+로 해야 인식한다함. 
            
            for(String s : plus){
                sum += Integer.parseInt(s);   
            }
            
            if(i == 0){
                SUM += sum;
            }
            else {
                SUM -= sum;
            }
                
        }
        
        System.out.println(SUM);
        
    }
}
