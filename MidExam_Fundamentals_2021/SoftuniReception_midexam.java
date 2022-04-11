import java.sql.SQLOutput;
import java.util.Scanner;

public class SoftuniReception_midexam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int employeeOne = Integer.parseInt(scanner.nextLine());
        int employeeTwo = Integer.parseInt(scanner.nextLine());
        int employeeThree = Integer.parseInt(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());

        int sumEfficiency = employeeOne + employeeTwo + employeeThree;
        int countHours = 0;
        int countRest = 0;
        while (students > 0) {
            countRest = countRest + 1;
            countHours = countHours + 1;
            if (countRest > 0 && countRest % 4 == 0) {
                students = students + sumEfficiency;
            } if(students <= sumEfficiency){
                break;
            }
            students = students - sumEfficiency;
        } System.out.println("Time needed: " + countHours + "h.");
    }
}
