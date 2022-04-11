import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AminerTask_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resource = scanner.nextLine();
        Map<String, Integer> resourceCount = new LinkedHashMap<>();

        while (!resource.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());
            if (!resourceCount.containsKey(resource)) {
                resourceCount.put(resource, quantity);
            }
            else{
                resourceCount.put(resource, resourceCount.get(resource) + quantity);
            }
            resource = scanner.nextLine();
        }
        resourceCount.forEach((k, v) ->System.out.println(k + " -> " +v));
    }
}
