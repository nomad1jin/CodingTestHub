import java.util.*;
import java.io.*;

public class Main {
    
    public static int[][] arr;
    public static int white;
    public static int blue;
    public static int N;
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        
        //1. 분할해서 같은 색인지 아닌지 boolean
        //2. 그 색이 흰색인지 파랑인지에 따라 카운트
        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<N; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        partition(0, 0, N);
        
        System.out.println(white);
        System.out.println(blue);
    }
    
    public static void partition(int row, int col, int size){
        
        //만약 색깔이 같다면 하얀색인지 파랑인지 구분해서 count
        if(color(row, col, size)){
            if(arr[row][col] == 0){
                white++;
            } else {
                blue++;
            }
            return;
        }
        
        //색이 다르면 재귀호출로 구간을 다시 분할해서 재탐색
        int halfSize = (size / 2);
        
        partition(row, col, halfSize);
        partition(row, col+halfSize, halfSize);
        partition(row+halfSize, col, halfSize);
        partition(row+halfSize, col+halfSize, halfSize);
    }
    
    //색깔이 같은지 확인하는 메소드
    public static boolean color(int row, int col, int size){
        
        int firstBlock = arr[row][col];
        
        //row, col부터 시작함!
        for(int i=row; i<row + size; i++){
            for(int j=col; j<col + size; j++){
                if(arr[i][j] != firstBlock){    
                    return false;
                }
            }
        }
        return true;
    }
}
