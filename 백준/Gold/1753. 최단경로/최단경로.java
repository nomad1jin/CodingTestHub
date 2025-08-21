import java.util.*;
import java.io.*;

class Node implements Comparable<Node>{
    
    private int index;
    private int distance;
    
    public Node(int index, int distance){
        this.index = index;
        this.distance = distance;
    }
    
    public int getIndex(){
        return this.index;
    }
    public int getDistance(){
        return this.distance;
    }
    
    @Override
    public int compareTo(Node other){
        // return this.distance - other.distance;
        return Integer.compare(this.distance, other.distance);
    }
}

public class Main {
    
    public static final int INF = (int) 1e9;
    public static ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();
    public static boolean visited[] = new boolean[100001];
    public static int d[] = new int[100001];
    public static int V, E;
    
    public static void dijkstra(int start){
    
        // PriorityQueue<Node> pq = new PriorityQueue<>((o1, o2) -> o1.distance - o2.distance);
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(start, 0));   //시작점 자신은 0으로 출력하기 
        d[start] = 0;
        while(!pq.isEmpty()){

            //최단거리 정보 꺼내기 
            Node node = pq.poll();
            int now = node.getIndex();
            int dis = node.getDistance();
            if(d[now] < dis) continue;   //이미 처리된 적 있다면 컨티뉴 이렇게???
                
            for(int j=0; j<graph.get(now).size(); j++){
                //거리 비교, cost에 d[now]잊지 말기 
                int otherIndex = graph.get(now).get(j).getIndex();
                int cost = d[now] + graph.get(now).get(j).getDistance();
                if(cost < d[otherIndex]){
                    d[otherIndex] = cost;
                    //pq에도 cost갱신
                    pq.offer(new Node(otherIndex, cost));
                }
            }
        }
        
    }
    
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(br.readLine());
        
        //그래프 초기화 (노드는 1부터 V개임, <=V임을 잊지말것)
        for(int i=0; i<=V; i++){
            graph.add(new ArrayList<Node>());
        }
        
        for(int i=0; i<E; i++){
            st = new StringTokenizer(br.readLine(), " ");
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            graph.get(u).add(new Node(v, w));
        }
        
        Arrays.fill(d, INF);
        dijkstra(start);
        
        StringBuilder sb = new StringBuilder(); 
        for(int i=1; i<=V; i++){
            if(d[i] == INF){
                // sb.append("INF\n");
                System.out.println("INF");
            } else {
                // sb.append(d[i]).append("\n");
                System.out.println(d[i]);
            }
        }
        // System.out.println(sb);
    }
}
