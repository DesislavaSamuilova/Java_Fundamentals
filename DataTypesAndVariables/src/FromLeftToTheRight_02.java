import java.util.Scanner;

public class FromLeftToTheRight_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());
        while (lines > 0) {

            String[] splitNumbers = scanner.nextLine().split(" ");
            long leftNum = Long.parseLong(splitNumbers[0]);
            long rightNum = Long.parseLong(splitNumbers[1]);
            int sumOfDigit = 0;
            if(leftNum >= rightNum){
                for (int j = 0; j < splitNumbers[0].length(); j++) {
                    sumOfDigit +=Math.abs(leftNum % 10);
                    leftNum = leftNum / 10;
                }

                }else {
                for (int j = 0; j < splitNumbers[1].length(); j++) {
                    sumOfDigit +=Math.abs(rightNum % 10);
                    rightNum = rightNum / 10;

                }
            }

            System.out.println(sumOfDigit);
            lines--;
        }

    }
}
