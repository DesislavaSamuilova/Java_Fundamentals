import java.util.*;

public class Elevator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        int capacityP = Integer.parseInt(scanner.nextLine());

        int fullCourses = (int) Math.ceil((double)numberOfPeople / capacityP);

            System.out.println(fullCourses);



    }
}
