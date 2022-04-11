import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LegendaryFarming_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int shards = 0;
        int fragments = 0;
        int motes = 0;
        Map<String, Integer> materials = new TreeMap<>();
        materials.put("shards", 0);
        materials.put("fragments", 0);
        materials.put("motes", 0);
        Map<String, Integer> junk = new TreeMap<>();
        boolean getReady = true;
        String legendaryItem = "";

        while (getReady) {
            String input = scanner.nextLine().toLowerCase(Locale.ROOT);
            String[] materialsArray = input.split("\\s+");
            for (int i = 1; i < materialsArray.length; i++) {
                if (materials.containsKey(materialsArray[i])) {
                    materials.put(materialsArray[i], materials.get(materialsArray[i]) + Integer.parseInt(materialsArray[i - 1]));
                } else {
                    if (junk.containsKey(materialsArray[i])) {
                        junk.put(materialsArray[i], junk.get(materialsArray[i]) + Integer.parseInt(materialsArray[i - 1]));
                    } else {
                        junk.put(materialsArray[i], Integer.parseInt(materialsArray[i - 1]));
                    }
                }
                i += 1;
                for (Map.Entry<String, Integer> entry : materials.entrySet()) {
                    if (entry.getValue() >= 250) {
                        getReady = false;
                        if (entry.getKey().equals("shards")) {
                            legendaryItem = "Shadowmourne";
                            materials.put(entry.getKey(), entry.getValue() - 250);
                        } else if (entry.getKey().equals("fragments")) {
                            legendaryItem = "Valanyr";
                            materials.put(entry.getKey(), entry.getValue() - 250);
                        } else if (entry.getKey().equals("motes")) {
                            legendaryItem = "Dragonwrath";
                            materials.put(entry.getKey(), entry.getValue() - 250);
                        }
                        break;
                    }
                }
                if (!getReady){
                    break;
                }
            }
        }
        System.out.printf("%s obtained!%n", legendaryItem);
        materials.entrySet().stream()
                .sorted((n1, n2) -> n2.getValue().compareTo(n1.getValue()))
                .forEach(e -> System.out.printf("%s: %d%n", e.getKey(), e.getValue()));
        junk.entrySet().stream()
                .sorted((n1, n2) -> n1.getKey().compareTo(n2.getKey()))
                .forEach(e -> System.out.printf("%s: %d%n", e.getKey(), e.getValue()));

    }
}
