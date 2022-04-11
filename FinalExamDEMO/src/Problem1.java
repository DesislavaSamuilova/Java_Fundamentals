import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] tokens = command.split("\\s+");
            String commandName = tokens[0];
            switch (commandName) {
                case "Translate":
                    String letter = tokens[1];
                    //  char[] currString = letter.toCharArray();
                    //  char stringTranslate = currString[0];
                    String replacement = tokens[2];
                    text = text.replaceAll(letter, replacement);
                    System.out.println(text);
                    break;
                case "Includes":
                    String stringIncludes = tokens[1];
                    if (text.contains(stringIncludes)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Start":
                    String stringStart = tokens[1];
                    String compare = text.substring(0, stringStart.length());
                    if (text.startsWith(stringStart)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Lowercase ":
                    text = text.toLowerCase();
                    System.out.println(text);
                    break;
                case "FindIndex":
                    char currIndex = tokens[1].charAt(0);
                    int index = text.lastIndexOf(currIndex);
                    System.out.println(index);
                    break;
                case "Remove":
                    int indexStart = Integer.parseInt(tokens[1]);
                    int count = Integer.parseInt(tokens[2]);
                    StringBuilder res = new StringBuilder(text);
                    res.replace(indexStart, indexStart + count, "");
                    text = res.toString();
                    System.out.println(res);
                    break;
            }

            command = scanner.nextLine();
        }
    }
}