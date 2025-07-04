import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        //입력받은 문자열의 중간부분까지 반복문
        //스택 push, pop을 통해 같으면 계속진행, 다르면 no
        
        String text;
        Scanner sc = new Scanner(System.in);
        
        while(!((text=sc.nextLine()).equals("0"))){
            Stack<Character> stack = new Stack<>();
            boolean isPalindrom = true;
            int len = text.length();
            
            for(int i=0; i<len/2; i++){
                stack.push(text.charAt(i));    
            }
            
            int startIndex = len%2==0 ? len/2 : len/2+1;
            for(int j=startIndex; j<len; j++){
                if(stack.pop() != text.charAt(j)){
                    isPalindrom = false;
                    break;
                }
                else {
                    isPalindrom = true;
                }
            }
            System.out.println(isPalindrom ? "yes" : "no");
        }
        sc.close();
    }
}
