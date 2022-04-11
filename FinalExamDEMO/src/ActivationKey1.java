import java.util.Scanner;

public class ActivationKey1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder key = new StringBuilder(scanner.nextLine());

        String command = scanner.nextLine();
        while (!command.equals("Generate")) {
            String[] tokens = command.split(">>>");
            String commandName = tokens[0];
            switch (commandName) {
                case "Contains":
                    String substring = tokens[1];
                    if (key.indexOf(substring) != -1) {
                        System.out.println(key + " contains " + substring);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String commandLetter = tokens[1];
                    int startIndex = Integer.parseInt(tokens[2]);
                    int endIndex = Integer.parseInt(tokens[3]);
                    for (int i = startIndex; i < endIndex; i++) {
                        char currChar = key.charAt(i);
                        if (commandLetter.equals("Upper")) {
                            key.setCharAt(i, Character.toUpperCase(currChar));
                        } else if (commandLetter.equals("Lower")) {
                            key.setCharAt(i, Character.toLowerCase(currChar));
                        }
                    }
                    System.out.println(key);
                    break;
                case "Slice":
                    int indexStart = Integer.parseInt(tokens[1]);
                    int indexEnd = Integer.parseInt(tokens[2]);
                    key.replace(indexStart, indexEnd, "");
                    System.out.println(key);
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println("Your activation key is: " + key);
    }
}
