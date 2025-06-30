import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double c = (double) a / b;  // 정수 형변환!!!!!
        System.out.print(c);
        
        sc.close();
    }
}
