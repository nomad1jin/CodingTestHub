import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        if(h == 0){
            if(m < 45){
                h = 23;
                m = 60 - (45 - m);
            } else {
                m = m - 45;
            }
        } else {
            if(m < 45){
                h--;
                m = 60 - (45 - m);
            } else {
                m = m - 45;
            }
        }
        System.out.println(h + " " + m);
    }
}
