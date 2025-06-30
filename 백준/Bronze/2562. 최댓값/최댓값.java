import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] arr = new Integer[10];
        int max = 0; 
        
        for(int i=1; i<10; i++){
            arr[i] = sc.nextInt();
            
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(Arrays.asList(arr).indexOf(max));
        
        sc.close();
    }
}
