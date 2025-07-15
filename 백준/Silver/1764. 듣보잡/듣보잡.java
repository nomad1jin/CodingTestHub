import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[] arr = new String[M];
        HashSet<String> set = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();
        
        for(int i=0; i<N; i++){
            set.add(br.readLine());
        }
        for(int i=0; i<M; i++){
            arr[i] = br.readLine();
        }
        
        for(int i=0; i<M; i++){
            if(set.contains(arr[i])){
                list.add(arr[i]);
            }
        }
        System.out.println(list.size());
        
        Collections.sort(list);
        for(String s : list){
            System.out.println(s);
        }
    }
}
