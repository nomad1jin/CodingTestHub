import java.util.*;
import java.io.*;

public class Main {
    static int[] arr;
    
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);   //이진 탐색을 위한 정렬 
        
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<M; i++){
            if(binarySearch(0, N-1, Integer.parseInt(st2.nextToken()))){
                sb.append("1\n");
            } else {
                sb.append("0\n");
            }
        }
        System.out.print(sb);
    }
    
    public static boolean binarySearch(int start, int end, int key){
        //재귀보다 while반복문이 낫다
        while(start <= end){
            int mid = (start + end) / 2;
        
            if(arr[mid] == key){
                return true;
            }
            else if(arr[mid] < key){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return false;
    }
}
