import java.util.Scanner;

public class ZigZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int[] firstArray = new int[number];
        int[] secondArray = new int[number];
        for (int i = 1; i <= number; i++) {
            String[] line = scanner.nextLine().split(" ");

            if (i % 2 == 0) {
                firstArray[i - 1] = Integer.parseInt(line[1]);
                secondArray[i - 1] = Integer.parseInt(line[0]);
            } else {
                firstArray[i - 1] = Integer.parseInt(line[0]);
                secondArray[i - 1] = Integer.parseInt(line[1]);
            }
        }
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < secondArray.length; i++) {
            System.out.print(secondArray[i] + " ");
        }
    }
}
