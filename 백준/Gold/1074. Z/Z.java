import java.util.*;
import java.io.*;

public class Main {
    
    public static int count = 0;
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        
        // 00 01 10 11 -> 02 03 12 13 -> 20 21 30 31 -> 22 23 32 33
        int size = (int) Math.pow(2, N);
        // 반복문아니고 분할정복, 재귀
        find(size, r, c);
        System.out.println(count);

    }
    
    //size = 4 (3,1)
    private static void find(int size, int r, int c){
        if(size == 1){
            return;
        }
        //편의상 1,2,3,4순서대로 생각함 (사분면X)
        if(r < size/2 && c < size/2){
            find(size/2, r, c);
        }
        //2번째이므로 r이 작고 c가 큰 케이스, 1번째를 이미 지나옴. 다음은 3번째로
        else if(r < size/2 && c >= size/2){
            count += (size * size / 4); 
            find(size/2, r, c-size/2);
        }
        else if(r >= size/2 && c < size/2){
            count += (size * size / 4) * 2;
            find(size/2, r-size/2, c);
        }
        else {
            count += (size * size / 4) * 3;
            find(size/2, r-size/2, c-size/2);
        }
    }
}
