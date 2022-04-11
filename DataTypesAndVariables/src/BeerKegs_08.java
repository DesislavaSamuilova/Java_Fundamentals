import java.util.Scanner;

public class BeerKegs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        double volume = 0;
        String kegName = "";
        double biggestKeg = 0;
        for (int i = 0; i < number; i++) {
            String currentModel = scanner.nextLine();
            float radius = Float.parseFloat(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double currentVolume = Math.PI * radius * radius * height;
            if (currentVolume > volume) {
                volume = currentVolume;
                biggestKeg = currentVolume;
                kegName = currentModel;
            }
        }
        System.out.println(kegName);

    }
}

