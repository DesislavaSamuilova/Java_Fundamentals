import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class BonysScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        int countOfLectures = Integer.parseInt(scanner.nextLine());
        int initialBonus = Integer.parseInt(scanner.nextLine());
        double maxBonus = 0;
        int maxAttendiance = 0;
        for (int i = 0; i < countOfStudents; i++) {
            int attendiance = Integer.parseInt(scanner.nextLine());
            double totalBonus = (attendiance * 1.0 / countOfLectures) * (5 + initialBonus);
            if (totalBonus > maxBonus) {
                maxBonus = totalBonus;
                maxAttendiance = attendiance;
            }
        }
        System.out.printf("Max Bonus: %.0f.%n", Math.ceil(maxBonus));
        System.out.printf("The student has attended %d lectures.", maxAttendiance);

    }

}
