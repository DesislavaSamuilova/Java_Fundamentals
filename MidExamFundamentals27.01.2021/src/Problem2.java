import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> sugarCubs = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("Mort")) {
            String[] input = command.split(" ");
            String name = input[0];
            switch (name) {
                case "Add":
                    String value = input[1];
                    sugarCubs.add(value);
                    break;
                case "Remove":
                    String valueFirstElement = input[1];
                    sugarCubs.remove(valueFirstElement);
                    break;
                case "Replace":
                    String num1 = input[1];
                    String num2 = input[2];
                    if (sugarCubs.contains(num1)) {
                        int index1 = sugarCubs.indexOf(num1);
                        sugarCubs.set(index1, num2);
                    }
                    break;
                case "Collapse":
                    int currNum = 0;
                    int collapseNum = Integer.parseInt(input[1]);
                    for (int i = 0; i < sugarCubs.size(); i++) {
                        int index = i;
                        currNum = Integer.parseInt(sugarCubs.get(index));
                        if (currNum < collapseNum) {
                            sugarCubs.remove(i);
                            i--;
                        }
                    }
                    break;

            }
            command = scanner.nextLine();
        }
        for (String sugarCub : sugarCubs) {
            System.out.print(" " + sugarCub);
        }
    }
}
