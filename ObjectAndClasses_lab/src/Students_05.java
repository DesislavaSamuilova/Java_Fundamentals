import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Student> students = new ArrayList<>();
        while (!input.equals("end")) {
            String firstName = getString(input);

            Student student = new Student();
            student.setFirstName(firstName);
            input = scanner.nextLine();
        }
    }
}