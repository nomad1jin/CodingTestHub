import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int num = 666;
        int count = 1;
        
        while(count != N){  //N이 아닐때만 실행 
            num++;
            if(String.valueOf(num).contains("666")){
                count++;
            }
        }
        System.out.println(num);
    }
}
