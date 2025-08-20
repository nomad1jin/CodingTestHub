import java.io.*;
import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> pQ = new PriorityQueue<>(new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2){
                //-4랑 3 -> 4랑 3 -> 양수면 알아서 3 4 로 정렬
                if(Math.abs(o1) > Math.abs(o2)) return Math.abs(o1) - Math.abs(o2);
                //절댓값이 같은 경우 o1 - o2하면 작은 값(음수)를 정렬해준다
                else if(Math.abs(o1) == Math.abs(o2)) return o1 - o2; 
                else return -1; //o1 < o2인 경우 -1
            }
        });
        
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            
            if(num == 0){
                //절댓값이 가장 작은 값을 출력
                if(pQ.isEmpty()){
                    sb.append("0").append("\n");
                } else {
                    sb.append(pQ.poll()).append("\n");
                }
                
            } else{
                pQ.add(num);
            }
        }
        System.out.println(sb);
    }
}
