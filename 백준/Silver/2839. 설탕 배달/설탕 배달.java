import java.util.*;

public class Main {
    public static void main(String[] args) {
        //상근이는 설탕을 n킬로그램
        //3키로봉지와 5키로봉지
        //적은 봉지. 18키로
        //나누기만 할게 아니라 빼기를 해야할듯 
   
        int basket = 0;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        while(N > 0){
            if(N % 5 == 0){
                //5로 나누어지면 봉지 더하기
                basket += N / 5;
                break;
                
            } else {
                N -= 3; //이게 핵심이다!!!!!!!!!!
                basket++;
            }
            
            //N>0일때 계속 진행하므로 break문 
            if(N < 0){
                basket = -1;
                break;
            }
        }
        System.out.println(basket);
    }
}
