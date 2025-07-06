import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 코드를 작성해주세요
        //216의 분해합 = 216+2+1+6 = 225
        //225의 생성자는 216
        //M + 첫째줄 + 둘쨰줄 + 셋째줄+ .. + = 216인 M을 찾아라
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = 0;
  
        for(int i=0; i<N; i++){
            int num = i;
            int sum = num;

            while(num > 0){
                sum += num % 10;
                num /= 10; 
            }
            
            if(sum == N){
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
