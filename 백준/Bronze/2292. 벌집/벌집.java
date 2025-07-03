import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 2~7: 2
        // 8~19: 3
        // 20~37: 4
        // 38~61: 5
        // 62~70: 6
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int count = 1;
        int range = 2;
        
        if(num == 1){
            System.out.print(count);
        }
        else{
            while (range <= num){
            //이 구문 한방으로 range보다 크거나 큰 값은 count를 증가시킴
            //작은값은 count를 증가시키지 않고 출력. 2, 8, 20 을 예로 볼것
            range = range + (6 * count);
            count++;
            }
            
            System.out.print(count);
        }
    }
}
