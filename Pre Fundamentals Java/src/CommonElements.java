import java.util.Arrays;
import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] firstArray = scanner.nextLine().split("\\s+");
        String[] secondArray = scanner.nextLine().split("\\s+");
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < secondArray.length; j++) {
                String firstWord = firstArray[i];
                String secondWord = secondArray[j];

                if(firstArray[i].equals(secondArray[j])){
                    System.out.print(firstWord + " ");
                }
            }
        }

    }
}



