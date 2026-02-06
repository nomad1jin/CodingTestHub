import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 회의 안 겹치게 최대 개수 찾기 
        // 중단 불가
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        // 그리디인가? 그렇다면 빨리 끝나는 회의 먼저 봐야할듯
        int[][] arr = new int[N][2];
        
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken()); 
        }
        
        Arrays.sort(arr, new Comparator<int[]>() {  
            
            @Override
            public int compare(int[] o1, int[] o2){
                //끝나는 시간이 같으면 더빨리 시작하는 회의 
                if(o1[1] == o2[1]){
                    return o1[0] - o2[0];
                } else {
                    return o1[1] - o2[1];
                }
            }
        });
        
        int count = 1;
        int min = arr[0][1];
        for(int i=1; i<N; i++){
            if(arr[i][0] >= min){
                //다음 회의 시작시간이 현재 끝난 회의 시간보다 크거나 같으면 
                //작은 경우에만 카운트 해야하니까 Math.min()말고 if문으로 
                min = arr[i][1];
                count++;
            }
        }
        System.out.println(count);
    }
}
