import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int row = Integer.parseInt(st.nextToken());
        int col = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int[][] arr = new int[row+1][col+1];
        //블록 제거는 2초
        //블록 놓기는 1초 
        //땅고르기 시간과 높이 출력
  
        int min = Integer.MAX_VALUE;
        int max = -1;
        for(int i=0; i<row; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<col; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                min = Math.min(min, arr[i][j]);
                max = Math.max(max, arr[i][j]);
            }         
        }
        
        int Time = Integer.MAX_VALUE;
        int Height = 0;
        for(int h=min; h<=max; h++){
            int time = 0;
            int spare = B;
            for(int i=0; i<row; i++){
                for(int j=0; j<col; j++){
                    if(arr[i][j] > h){
                        //블록을 제거하는 경우
                        time += 2 * (arr[i][j] - h);
                        spare += (arr[i][j] - h);
                    } else {
                        //블록을 쌓는 경우 arr[i][j] < h
                        time += (h - arr[i][j]);
                        spare -= (h - arr[i][j]);
                    }
                }
            } 
            
            // 인벤토리 블록은 음수가 될 수 없다. 양수인 경우에만 비교 
            if(spare >= 0){
                if(Time >= time){
                    Time = time;
                    Height = h;
                }  
            } 
        }
        System.out.println(Time + " " + Height);
        
    }
}
