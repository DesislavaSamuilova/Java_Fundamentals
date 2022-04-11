import java.util.Scanner;

public class ImitationGame1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Decode")) {
            String[] commandArray = command.split("\\|");
            String commandName = commandArray[0];
            switch (commandName) {
                case "Move":
                    int numberOfLettersToMove = Integer.parseInt(commandArray[1]); // 3
                    String cutLetters = message.substring(0, numberOfLettersToMove);
                    String remainingLetters = message.substring(numberOfLettersToMove, message.length());
                    message = remainingLetters + cutLetters;
                    break;
                case "Insert":
                    int index = Integer.parseInt(commandArray[1]);
                    String addLetter = commandArray[2];

                    String firstPart = message.substring(0, index);
                    String secondPart = message.substring(index, message.length());
                    message = firstPart + addLetter + secondPart;
                    break;
                case "ChangeAll":
                    String substring = commandArray[1];
                    String replacement = commandArray[2];
                    for (int i = 0; i < message.length(); i++) {
                        message = message.replace(substring, replacement);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println("The decrypted message is: " + message);
    }
}

