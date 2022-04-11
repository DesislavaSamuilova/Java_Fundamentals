import java.util.Scanner;

public class demoproblem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        String command = scan.nextLine();
        while (!command.equals("End")) {
            String[] tokens = command.split("\\s+");
            String nameCommand = tokens[0];
            if (nameCommand.equals("Translate")) {
                String charToFind = tokens[1];
                String replacement = tokens[2];
                input = input.replaceAll(charToFind, replacement);
                System.out.println(input);
            } else if (nameCommand.equals("Includes")) {
                String string = tokens[1];
                if (input.contains(string)) {
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }
            } else if (nameCommand.equals("Start")) {
                String str = tokens[1];
                if (input.contains(str)) {
                    String strToCompare = input.substring(0, str.length());
                    if (strToCompare.equals(str)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                }
            } else if (nameCommand.equals("Lowercase")) {
                input = input.toLowerCase();
                System.out.println(input);
            } else if (nameCommand.equals("FindIndex")) {
                char charIndex = tokens[1].charAt(0);
                int indexToPrint = input.lastIndexOf(charIndex);
                System.out.println(indexToPrint);
            } else if (nameCommand.equals("Remove")) {
                int startIndex = Integer.parseInt(tokens[1]);
                int count = Integer.parseInt(tokens[2]);
                StringBuilder result = new StringBuilder(input);
                result.replace(startIndex, startIndex + count, "");
                System.out.println(result);
            }


            command = scan.nextLine();
        }
    }
}

