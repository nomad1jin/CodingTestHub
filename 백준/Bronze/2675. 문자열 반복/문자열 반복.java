import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
    
        for(int i =0; i<n; i++){
            String[] arr = br.readLine().split(" ");
            int time = Integer.parseInt(arr[0]);
            String s = arr[1];
            
            for(int j = 0; j<s.length(); j++){  //한글자당
                for(int k = 0; k<time; k++){    //k번 반복
                    System.out.print(s.charAt(j));
                }    
            }
            System.out.println();
        }
    }
}
