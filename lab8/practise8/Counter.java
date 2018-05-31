import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;
 
class Counter {
    
    private static Scanner standardInputScanner = new Scanner(System.in);
    
    public static void main(String[] args) {
                       
        System.out.println("input string: ");
        String text = standardInputScanner.nextLine();
        
        HashMap<String, Integer> hashMap = new HashMap<>();
        StringTokenizer tokenizer = new StringTokenizer(text, " ,.:;!?\t");
                
        while(tokenizer.hasMoreTokens()) {
            
            final String token = tokenizer.nextToken();
            final Integer value = hashMap.get(token);
            
            if(value != null)
                hashMap.put(token, value + 1);
            else
               hashMap.put(token, 1);
        }
                        
        System.out.printf("\ncount: %d\n", hashMap.size());
        for(Map.Entry<String, Integer> entry : hashMap.entrySet())
            System.out.printf("%s -> %d\n", entry.getKey(), entry.getValue());
    }
}