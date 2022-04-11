import java.util.Arrays;
import java.util.Scanner;

public class LadyBugs_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fieldSize = Integer.parseInt(scanner.nextLine());
        int[] indexesLadyBugs = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String command = scanner.nextLine();
        int[] ladyBugField = new int[fieldSize];
        for (int i = 0; i < ladyBugField.length; i++) {
            ladyBugField[i] = indexesLadyBugs[i];
        }
        while (!command.equals("end")) {

        }
    }
}
