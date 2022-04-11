import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        int numberOfMoves = 0;
        while (!command.equals("end")) {
            numberOfMoves++;
            String[] indexes = command.split(" ");
            int index1 = Integer.parseInt(indexes[0]);
            int index2 = Integer.parseInt(indexes[1]);
            if (index1 == index2 || index1 < 0 || index2 < 0 || index1 >= numbers.size() || index2 >= numbers.size()) {
                String added = "-" + numberOfMoves + "a";
                numbers.set(numbers.size() / 2, added);
                numbers.set((numbers.size() / 2) + 1, added);
                System.out.printf("Invalid input! Adding additional elements to the board%n");
            } else if (numbers.get(index1).equals(numbers.get(index2))) {
                System.out.printf("Congrats! You have found matching elements - %d!%n", index1);

                if (index1 > index2) {
                    numbers.remove(index1);
                    numbers.remove(index2);
                } else {
                    numbers.remove(index2);
                    numbers.remove(index1);
                }
            } else if (!numbers.get(index1).equals(numbers.get(index2))) {
                System.out.printf("Try again!%n");
            }
            if (numbers.size() == 0) {
                System.out.printf("You have won in %d turns!%n", numberOfMoves);
                return;
            }

            command = scanner.nextLine();
        }
        if (numbers.size() != 0) {
            System.out.printf("Sorry you lose :(%n");
            System.out.println(String.join(" ", numbers));
        }
    }
}



