import java.util.Scanner;

public class SinoTheWalker_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String livingTme = scanner.nextLine();
        int steps = Integer.parseInt(scanner.nextLine()) % 86400;
        int secPerSteps = Integer.parseInt(scanner.nextLine()) % 86400;

        long seconds = steps * secPerSteps;

    }
}
