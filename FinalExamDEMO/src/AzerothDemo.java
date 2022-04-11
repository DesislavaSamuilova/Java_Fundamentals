import java.util.Scanner;

public class AzerothDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder line = new StringBuilder(scanner.nextLine());
        String skill = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("For Azeroth")) {
            String[] tokens = command.split("\\s+");
            String commandName = tokens[0];
            if (!commandName.equals("GladiatorStance") && !commandName.equals("Target") && !commandName.equals("Dispel") && !commandName.equals("DefensiveStance")) {
                System.out.println("Command doesn't exist!");
                break;
            }

            switch (commandName) {
                case "GladiatorStance":
                    for (int i = 0; i < skill.length(); i++) {
                        char currSymbolUpper = skill.charAt(i);
                        skill = skill.toUpperCase();
                        line.append(Character.toUpperCase(currSymbolUpper));
                    }
                    System.out.println(skill);
                    break;
                case "DefensiveStance":
                    for (int i = 0; i < skill.length(); i++) {
                        char currSymbolLower = skill.charAt(i);
                        skill = skill.toLowerCase();
                        line.append(Character.toLowerCase(currSymbolLower));
                    }
                    System.out.println(skill);
                    break;
                case "Dispel":
                    int index = Integer.parseInt(tokens[1]);
                    String letter = tokens[2];
                    char[] lineToChar = letter.toCharArray();
                    char lastIndex = lineToChar[0];
                    if (index > skill.length() || index < 0) {
                        System.out.println("Dispel too weak.");
                    } else {
                        line.setCharAt(index, lastIndex);
                        System.out.println("Success!");
                    }
                    break;
                case "Target":
                    String action = tokens[1];
                    if (action.equals("Change")) {
                        String substring = tokens[2];
                        String secondSubstring = tokens[3];
                        skill = skill.replace(substring, secondSubstring);
                    } else if (action.equals("Remove")) {
                        String substringRemove = tokens[2];
                        skill = skill.replace(substringRemove, "");
                    }
            }
            command = scanner.nextLine();
        }


    }

}


/*
fr1c710n
GladiatorStance
Dispel 2 I
Dispel 4 T
Dispel 6 O
Dispel 5 I
Dispel 10 I
Target Change RICTION riction
For Azeroth
 */
/*
DYN4MICNIC
Target Remove NIC
Dispel 3 A
DefensiveStance
Target Change d D
target change D d
For Azeroth
 */
