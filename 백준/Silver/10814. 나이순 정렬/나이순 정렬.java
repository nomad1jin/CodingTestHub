import java.util.*;
import java.io.*;

class Person {
    public int age;
    public String name;
    public int index;
    
    Person(int age, String name, int index){
        this.age = age;
        this.name = name;
        this.index = index;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        
        //나이 오름차순, 만약 같다면 가입일자 오름차순 
        //가입한 순서는 입력순인데, 이를 어떻게 구현???
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Person> list = new ArrayList<>();
        
        for(int n=0; n<N; n++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            int index = n;
        
            list.add(new Person(age, name, index));
        }
        
        Collections.sort(list, (p1, p2) -> {
            if(p1.age == p2.age){
                return Integer.compare(p1.index, p2.index);   //나이가 같으면 가입일자 순
            }
            else {
                return Integer.compare(p1.age, p2.age);
            }
        });
        
        for(Person p : list){
            System.out.println(p.age + " " + p.name);
        }
    }
}
