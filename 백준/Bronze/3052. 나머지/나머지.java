import java.util.*;

public class Main {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        
        for(int i=0; i<10; i++){
            int a = sc.nextInt();
            int num = a % 42;
            
            if(!list.contains(num)) {
                list.add(num);
                count++;
            }  
        }
        System.out.println(count);
    }
}
