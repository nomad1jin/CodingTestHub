import java.util.*;

public class Main {
    
    public static Queue<Integer> q = new LinkedList<>();
    public static int[] count = new int[100001];
    public static int[] dMove = {-1, 1, 2};
    public static int K, N;
    
    public static void main(String[] args) {
        
        // 수빈이의 위치에서 3가지 선택지를 가지게된다
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        
        q.offer(N);
        count[N] = 1;
        
        if(N == K){
            System.out.println(0);  //첨부터 같으면 0 
        } else {
            bfs();
        }
    }
    
    public static void bfs(){
        while(!q.isEmpty()){
            
            int temp = q.poll();
            int next;
            
            // 반복문으로 -1, 1, 2배의 경우를 계산하기
            for(int i=0; i<dMove.length; i++){
                if(i == 2){
                    next = temp * dMove[i];
                } else {
                    next = temp + dMove[i];    //-1, 1의 경우
                }
                
                //만약 같다면 현재 카운트를 프린트하고 바로 리턴
                if(next == K){
                    System.out.println(count[temp]);
                    return;
                }
                
                //계속 진행하려면? 카운트가 0인걸 방문해야됨
                if(next >= 0 && next < count.length && count[next] == 0){
                    q.add(next);
                    count[next] = count[temp] + 1;  //이전까지의 카운트를 누적할 수 있도록
                    // 음수 방지하고, 배열 인덱스 ~100000까지를 해서 보다 적은 수를 사용
                }
                
            }   
        }
    }
}
