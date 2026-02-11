import java.io.*;
import java.util.*;

public class Main {
    
    private static Stack<Integer> stack;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int instruction = Integer.parseInt(st.nextToken());
            if (instruction == 1) {
                int x = Integer.parseInt(st.nextToken());
                stack.push(x);
            }

            if (instruction == 2) {
                if (stack.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(stack.pop() + "\n");
                }
            }

            if (instruction == 3) {
                sb.append(stack.size() + "\n");
            }

            if (instruction == 4) {
                if (stack.isEmpty()) {
                    sb.append("1\n");
                } else {
                    sb.append("0\n");
                }
            }

            if (instruction == 5) {
                if (stack.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(stack.peek() + "\n");
                }
            }
        }
        System.out.print(sb);
    }
}