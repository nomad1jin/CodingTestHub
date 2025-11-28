import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        // 1. 체스판을 8x8으로 자를것
        // 2. 첫 칸을 기준으로 진행할 것
        // 3. 다시 칠할 칸의 수가 최소일 것
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st1.nextToken());
        int m = Integer.parseInt(st1.nextToken());
        char[][] arr = new char[n][m];
        
        // 체스판 입력받기
        for(int i=0; i<n; i++){
            String line = br.readLine();
            
            for(int j=0; j<m; j++){
                arr[i][j] = line.charAt(j);
            }
        }
        
        // 체스판 8x8 자르기
        int count = Integer.MAX_VALUE;
        
        for(int i=0; i<=n-8; i++){
            for(int j=0; j<=m-8; j++){
                
                // 최솟값 구하기
                int result = getMinCost(i, j, arr);
                
                if(count > result){
                    count = result;
                }
            }
        }
        System.out.println(count);
    }
    
    public static int getMinCost(int startRow, int startCol, char[][] arr){
      
        //시작을 W칸으로 하여 체크하기
        int whiteCount = 0;
        
        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                
                char current = arr[startRow + i][startCol + j];
                // (i + j)가 짝수인 칸은 시작 색인 W과 같아야 하고,
                // 홀수인 칸은 반대 색이어야 함
                if((i+j) % 2 == 0) {
                    if (current != 'W') {
                        whiteCount++;   //아닐 경우 다시 칠해야함
                    }
                } else {
                    if (current != 'B') {
                        whiteCount++;
                    }
                }
            }
        }
        int blackCount = 64 - whiteCount;
        
        return Math.min(whiteCount, blackCount);
    }
}
