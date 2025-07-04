import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] arr = new String[N];
        
        for(int i =0; i<N; i++){ 
            int count = 0;
            int sum = 0;
           //입력한 것을 배열로 
            arr[i] = sc.next();
            
            for(int j=0; j<arr[i].length(); j++){   //문자열
                if(arr[i].charAt(j)=='O'){
                    count++;
                }
                else {
                    count = 0;
                }
                sum += count;
            }
            System.out.println(sum);

        }
    }
}
