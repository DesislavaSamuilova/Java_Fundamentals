import java.util.Scanner;

public class demo {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            StringBuilder message = new StringBuilder(scanner.nextLine());
            String command = scanner.nextLine();

            while (!command.equals("Decode")) {
                String[] commandArray = command.split("\\|");
                String commandName = commandArray[0];
                switch (commandName) {
                    case "Move":
                        int numOfLetters = Integer.parseInt(commandArray[1]);
                        for (int i = 0; i < numOfLetters; i++) {
                            char character = message.charAt(i);
                            message.deleteCharAt(i);
                            message.append(character);
                        }
                        break;
                    case "Insert":
                        int index = Integer.parseInt(commandArray[1]);
                        String value = commandArray[2];
                        message.insert(index, value);
                        break;
                    case "ChangeAll":
                        String substring = commandArray[1];
                        String replacement = commandArray[2];
                        for (int i = 0; i < message.length(); i++) {
                            message.toString().replaceAll(substring, replacement);
                        }
                        break;
                }
                command = scanner.nextLine();
            }
            System.out.println("The decrypted message is: " + message);
        }
    }

