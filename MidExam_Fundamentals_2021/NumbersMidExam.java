import java.util.*;
import java.util.stream.Collectors;

public class NumbersMidExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        double averageSum = 0;
        double current = 0;
        double countOfAverage = numbers.size();
        int currentCompareNum = 0;

        for (int i = 0; i < numbers.size(); i++) {
            current += numbers.get(i);
        }
        averageSum = current / (int) countOfAverage;

        List<Integer> newArr = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > averageSum) {
                currentCompareNum = numbers.get(i);
                newArr.add(currentCompareNum);
                Collections.sort(newArr, Collections.reverseOrder());
            }
        }

        int biggerNum = 0;
        int count = 0;
        if (newArr.size() == 0) {
            System.out.println("No");
        } else if (newArr.size() > 5) {
            for (int i = 0; i < newArr.size(); i++) {
                count++;
                biggerNum = newArr.get(i);
                System.out.print(biggerNum + " ");
                if (count == 5) {
                    break;
                }
            }
        }else if(newArr.size() <= 5){
            for (int i = 0; i < newArr.size(); i++) {
                biggerNum = newArr.get(i);
                System.out.print(biggerNum + " ");
            }
        }
    }
}








