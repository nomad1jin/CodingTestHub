import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(true){
            
            String texts = sc.nextLine();
                        
            if(texts.equals("EOI")){
                break;
            }
            
            String newtexts = texts.replaceAll("," , "");
            String text = newtexts.replaceAll(" ", "");

            if(text.toLowerCase().contains("nemo")){
                System.out.println("Found");
            }
            else {
                System.out.println("Missing");
            }
        }
        sc.close();
    }
}
