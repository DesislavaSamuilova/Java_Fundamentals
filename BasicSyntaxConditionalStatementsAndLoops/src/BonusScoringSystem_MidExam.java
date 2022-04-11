import java.util.Scanner;

public class BonusScoringSystem_MidExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students = Integer.parseInt(scanner.nextLine());
        int lectures = Integer.parseInt(scanner.nextLine());
        int bonus = Integer.parseInt(scanner.nextLine());
        double maxBonus = 0;
        int maxAttendance = 0;
        for (int i = 0; i < students; i++) {
            int attendances = Integer.parseInt(scanner.nextLine());
            double totalBonus =Math.round (1.0*attendances / lectures) * (5 + bonus);
///////////////////////////////////////////////////////////////////
            if(maxBonus < totalBonus){
                maxBonus = totalBonus;
                maxAttendance = attendances;
            }
        }
        System.out.printf("Max Bonus: %.0f.", Math.ceil(maxBonus));
        System.out.println();
        System.out.printf("The student has attended %d lectures.", maxAttendance);

    }
}
