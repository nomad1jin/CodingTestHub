import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        //N입력받기
        //성적 3개 중에 최대인 M을 찾기
        //각 성적에 /M * 100하고 
        //위를 토대로 평균 구하기
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Double[] arr = new Double[N];
        double sum = 0.0;
        
        for(int i=0; i<N; i++){
            arr[i] = Double.parseDouble(sc.next());
        }
        Arrays.sort(arr);
        for(int j=0; j<N; j++){
            sum += (arr[j] / arr[N-1] * 100);
        }
        System.out.println(sum/N);
    }
}
