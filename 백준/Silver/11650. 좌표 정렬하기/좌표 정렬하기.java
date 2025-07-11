import java.util.*;

class Point{
    int x;
    int y;
    
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class Main {
    public static void main(String[] args) {
        // 코드를 작성해주세요
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Point[] arr = new Point[N];
        // int[] y = new int[N];
        
        // for(int i=0; i<N; i++){
            // x[i] = sc.next();
            // y[i] = sc.next();
            // sc.nextLine();
        // }
        
        for(int i=0; i<N; i++){
            arr[i] = new Point(sc.nextInt(), sc.nextInt()); //x와 y
            sc.nextLine();
        }
        
        Arrays.sort(arr, (p1, p2) -> {
            if(p1.x == p2.x){
                return Integer.compare(p1.y, p2.y);
            } else {
                return Integer.compare(p1.x, p2.x);
            }
        });
        
        for(Point p : arr){
            System.out.println(p.x + " " + p.y);
        }
    }
}
