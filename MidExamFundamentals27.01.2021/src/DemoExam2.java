import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DemoExam2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("Done")) {
            String[] input = command.split(" ");
            String firstName = input[0];
            String secondName = input[1];
            if (firstName.equals("Move") && secondName.equals("Left")) {
                String index = input[2];
                if (!list.contains(index)) {
                    list.set(list.size() - 1, index);
                }
            } else if (firstName.equals("Move") && secondName.equals("Right")) {
                String indexRight = input[2];
                if (!list.contains(indexRight)) {
                    list.set(list.size() + 1, indexRight);
                }
            } else if (command.equals("Check Even")) {
                for (int i = 0; i < list.size(); i++) {
                    if (i % 2 == 0) {
                        System.out.print(list.get(i) + " ");
                    }
                }
            } else if (command.equals("Check Odd")) {
                for (int i = 0; i < list.size(); i++) {
                    if (i % 2 == 1) {
                        System.out.print(list.get(i) + " ");
                    }
                }

            }
            command = scanner.nextLine();
        }
        for (String s : list) {
            System.out.printf("You crafted %s!", list);
        }
    }
}
