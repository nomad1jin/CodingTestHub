import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        //C(n, r) = r! / n!*(n-r)!
        
        Scanner sc = new Scanner(System.in);
        int r = Integer.parseInt(sc.next());
        int n = Integer.parseInt(sc.next());

        int nsum = 1;
        int rsum = 1;
        int nrsum = 1;
        int start = Math.abs(n-r);
        
        for(int i=r; i>0; i--){
            rsum = rsum * i;
        }
        for(int j=n; j>0; j--){
            nsum = nsum * j;
        }
        for(int k=start; k>0; k--){
            nrsum = nrsum * k;
        }
        System.out.println(rsum / (nsum * nrsum));
    }
}
