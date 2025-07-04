import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        // String[] arr = {a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,p,u,v,w,x,y,z};
        Integer[] arr = new Integer[26];
        
        for(int i=0; i<26; i++){
            arr[i] = -1;
        }
        
        for(int i=0; i<word.length(); i++){
            char c = word.toLowerCase().charAt(i);
            int index = c - 'a';    //입력한 글자의 등장 위치
            if(arr[index] == -1){
                arr[index] = i;   //입력한 글자의 순서
            }
        }
        
        for(Integer text : arr){
            System.out.print(text + " ");
        }
    }
}
