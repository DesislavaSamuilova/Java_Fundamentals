import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShootForWin_midExam2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();
        int counter = 0;
        List<Integer> newArr = new ArrayList<>(numbers);

        while (!command.equals("End")) {
            int index = Integer.parseInt(command);
            int currentValue = 0;
            if (index <= numbers.size() - 1 && index > -1) {
                counter += 1;
                if (counter > 1) {
                    currentValue = newArr.get(index);
                    numbers.set(index, -1);
                    for (int i = 0; i < newArr.size(); i++) {

                        if (newArr.get(i) == -1) {
                            continue;
                        }

                        if (currentValue < newArr.get(i)) {
                            int currentNum = newArr.get(i) - currentValue;
                            newArr.set(index, -1);
                            newArr.set(i, currentNum);
                        } else if (currentValue >= newArr.get(i) && currentValue > -1) {
                            int currentNum = newArr.get(i) + currentValue;
                            newArr.set(index, -1);
                            newArr.set(i, currentNum);
                        }
                    }
                } else {
                    currentValue = numbers.get(index);
                    numbers.set(index, -1);
                    for (int i = 0; i < numbers.size(); i++) {
                        if (numbers.get(i) == -1) {
                            continue;
                        }

                        if (currentValue < numbers.get(i)) {
                            int currentNum = numbers.get(i) - currentValue;
                            newArr.set(index, -1);
                            newArr.set(i, currentNum);
                        } else if (currentValue >= numbers.get(i) && currentValue > -1) {
                            int currentNum = numbers.get(i) + currentValue;
                            newArr.set(index, -1);
                            newArr.set(i, currentNum);
                        }
                    }
                }

            }
            command = scanner.nextLine();

        }

        System.out.printf("Shot targets: %d ->", counter);
        for (int num : newArr) {
            System.out.printf(" %d", num);
        }
    }
}