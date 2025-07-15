import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = new int[10];
        
        String total = Integer.toString(a * b * c);
        for(int i=0; i<total.length(); i++){
            //해당되는 숫자를 배열 인덱스로하여 1 더하기
            arr[(total.charAt(i) - '0')]++;
        }
        
        for(int str : arr){
            System.out.println(str);
        }
    }
}
