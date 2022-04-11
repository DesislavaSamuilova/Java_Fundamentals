import java.util.Scanner;

public class WorldTour1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String givenString = scanner.nextLine();
        String command = scanner.nextLine();
        while (!command.equals("Travel")) {
            String[] tokens = command.split(":");
            String commandName = tokens[0];
            switch (commandName) {
                case "Add Stop":
                    int index = Integer.parseInt(tokens[1]);
                    String string = tokens[2];
                    if (index < givenString.length() && index >= 0) {
                        StringBuilder addStop = new StringBuilder(givenString);
                        givenString = addStop.insert(index, string).toString();
                    }
                    System.out.println(givenString);
                    break;
                case "Remove Stop":
                    int startIndex = Integer.parseInt(tokens[1]);
                    int endIndex = Integer.parseInt(tokens[2]);
                    if ((startIndex >= 0 && startIndex < givenString.length()) && (endIndex >= 0 && endIndex < givenString.length())) {
                        StringBuilder removeStop = new StringBuilder(givenString);
                        givenString = removeStop.replace(startIndex, endIndex + 1, "").toString();
                    }
                    System.out.println(givenString);
                    break;
                case "Switch":
                    String oldString = tokens[1];
                    String newString = tokens[2];
                    if (givenString.contains(oldString)) {
                        givenString = givenString.replace(oldString, newString);
                    }
                    System.out.println(givenString);
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println("Ready for world tour! Planned stops: " + givenString);
    }
}
