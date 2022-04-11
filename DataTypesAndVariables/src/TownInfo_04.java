import java.util.Scanner;

public class TownInfo_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameOfTown = scanner.nextLine();
        int populationOfTown = Integer.parseInt(scanner.nextLine());
        int areaOfTown = Integer.parseInt(scanner.nextLine());

        System.out.printf("Town %s has population of %d and area %d square km.",nameOfTown,populationOfTown,areaOfTown);


    }
}
