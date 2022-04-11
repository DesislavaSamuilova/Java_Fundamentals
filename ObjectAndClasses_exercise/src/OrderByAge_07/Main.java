package OrderByAge_07;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Orders> order = new ArrayList<>();
        while(!input.equals("End")){
            String[] tokens = input.split("\\s+");
            String firstName = tokens[0];
            String numberID = tokens[1];
            int age = Integer.parseInt(tokens[2]);

            Orders person = new Orders(firstName, numberID, age);
            order.add(person);

            input = scanner.nextLine();

        }

        order.sort(Comparator.comparing(Orders::getAge));
        for (Orders orders : order) {
            System.out.print(orders);
        }
    }
}
