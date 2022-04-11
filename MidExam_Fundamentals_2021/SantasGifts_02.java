import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SantasGifts_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        List<String> visitHouses = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());
        int currentIndex = 0;
        for (int i = 0; i < num; i++) {
            String[] command = scanner.nextLine().split("\\s+");
            if (command[0].equals("Forward")) {
                int steps = Integer.parseInt(command[1]);
                int index = currentIndex + steps;
                if (index >= 0 && index < visitHouses.size()) {
                    visitHouses.remove(index);
                    currentIndex = index;
                }
            } else if (command[0].equals("Back")) {
                int steps = Integer.parseInt(command[1]);
                int index = currentIndex - steps;
                if (index >= 0 && index < visitHouses.size()) {
                    visitHouses.remove(index);
                    currentIndex = index;
                }
            } else if (command[0].equals("Gift")) {
                int index = Integer.parseInt(command[1]);
                String newNumber = command[2];
                if (index >= 0 && index < visitHouses.size()) {
                    visitHouses.add(index, newNumber);
                    currentIndex = index;
                }
            } else if (command[0].equals("Swap")) {
                String first = command[1];
                String second = command[2];
                int index1 = visitHouses.indexOf(first);
                int index2 = visitHouses.indexOf(second);
                if (index1 != -1 && index2 != -1) {
                   visitHouses.set(index1, second);
                    visitHouses.set(index2, first);
                }
            }
        }
        System.out.printf("Position: %d%n", currentIndex);
        System.out.println(String.join(", ", visitHouses));
    }
}

