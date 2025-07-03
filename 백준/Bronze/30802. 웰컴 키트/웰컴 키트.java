import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
     
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Integer[] arr = new Integer[6];
        int sum = 0;
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        
        for(int i=0; i<6; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int tshirt = Integer.parseInt(st1.nextToken());
        int pen = Integer.parseInt(st1.nextToken());
        
        for(int i=0; i<6; i++){
            sum += arr[i] / tshirt;
            sum += (arr[i]%tshirt) > 0 ? 1 : 0;
        }
        bw.write(sum + "\n");
        bw.write(N / pen + " " + N % pen);
 
        br.close();
        bw.flush();
        bw.close();
    }
}
