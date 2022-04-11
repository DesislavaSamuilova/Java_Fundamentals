import java.util.*;
import java.util.stream.Collectors;


public class DemoExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> list = Arrays.stream(scan.nextLine().split("!")).collect(Collectors.toList());
        String commands = scan.nextLine();
        while (!commands.equals("Go Shopping!")) {
            String[] tokens = commands.split(" ");
            String command = tokens[0];
            String item = tokens[1];
            switch (command) {
                case "Urgent":
                    if (!list.contains(item)){
                        list.add(0, item);
                    }
                    break;
                case "Unnecessary":
                    if (list.contains(item)){
                        list.remove(item);
                    }
                    break;
                case "Correct":
                    String newItem = tokens[2];
                    if (list.contains(item)){
                        list.set(list.indexOf(item), newItem);
                    }
                    break;
                case "Rearrange":
                    if (list.contains(item)) {
                        int index = list.indexOf(item);
                        list.remove(item);
                        list.add(item);
                    }
                    break;
            }
            commands = scan.nextLine();
        }
        System.out.println(String.join(", ", list));
    }
}