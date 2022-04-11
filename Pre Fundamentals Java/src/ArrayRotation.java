import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split("\\s+");
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < number; i++) {
            String firstElement = array[0];
            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[array.length - 1] = firstElement;

        }
        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
        }

    }
}

