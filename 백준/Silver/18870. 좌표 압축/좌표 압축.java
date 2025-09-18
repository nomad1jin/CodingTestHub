import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 정렬을 한 다음에 정수를 부여하고 출력
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        
        int[] arr = new int[n];
        int[] sort = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            sort[i] = arr[i];
        }
        
        Arrays.sort(sort);
        HashMap<Integer, Integer> map = new HashMap<>();
        int rank=0;
        
        for(int i=0; i<n; i++){
            if(!map.containsKey(sort[i])){
                //값과 인덱스라고 생각했는데, 인덱스로 하면 같은 숫자여도 ++함
                map.put(sort[i], rank);
                rank++;
            }
        }
        
        //배열이랑 키랑 같으면 값을 꺼내려했는데, 그게 아니라 배열 순회하면서 값을 다 꺼내기
        for(int key : arr){
            sb.append(map.get(key)).append(" ");
        }
        System.out.println(sb);
    }
}
