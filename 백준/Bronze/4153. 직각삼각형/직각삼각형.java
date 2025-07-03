import java.util.*;
import java.io.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        while(true){
            
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken()); 
            int c = Integer.parseInt(st.nextToken());
            
            int[] arr = {a,b,c};
            
            if(a==0 && b==0 && c==0){
                break;
            }
            
            Arrays.sort(arr);

            if(Math.pow(arr[2],2) == (Math.pow(arr[0], 2) + Math.pow(arr[1], 2))){
                System.out.println("right");
            }
            else {
                System.out.println("wrong");
            }
        }
    }
}
