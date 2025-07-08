import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        //a층의 b호에 살려면 자신의 a-1아래층의 1~b호까지의 사람들의 수 합만큼 사람을 데려와 살아...
        //1층 3호에 몇명, 2층 3호에 몇명
        //0층의 i호에는 i명..
        //1층 3호에 살려면, 0층 1호+2호+3호 사람의 수 => 6
        //2층 3호에 살려면, 1층 1호+2호+3호 사람의 수 => 
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
           
        while(sc.hasNextInt()){
            int k = sc.nextInt();   //층
            int n = sc.nextInt();   //호
            int[][] arr = new int[k+1][n+1];
            
            //0층 1,2,3호에 대한 값
            for(int i=1; i<=n; i++){
                arr[0][i] = i;
            }
            
            for(int i=1; i<=k; i++){
                for(int j=1; j<=n; j++){
                    arr[i][j] = arr[i][j-1] + arr[i-1][j];
                }
            }
            System.out.println(arr[k][n]);            
        }
    }
}
