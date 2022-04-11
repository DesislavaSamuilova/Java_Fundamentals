import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Map<Character, Integer> count = new LinkedHashMap<>();

        for (int index = 0; index < text.length() ; index++) {
            char currentSymbol = text.charAt(index);
            if(currentSymbol == ' '){
                continue;
            }
            if(!count.containsKey(currentSymbol)){
                count.put(currentSymbol, 1);
            }else{
                count.put(currentSymbol, count.get(currentSymbol) + 1);
            }
        }
        for (Map.Entry<Character,Integer> entry : count.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
