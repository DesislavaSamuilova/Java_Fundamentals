import java.util.Scanner;

public class Messages_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        String message = "";
        for (int i = 0; i < lines ; i++) {
            String input = scanner.nextLine();
            int numbers = input.length();
            char buttonNumber = input.charAt(0);

            if (buttonNumber == '2') {
                if (numbers == 1) {
                    message += "a";
                } else if (numbers == 2) {
                    message += "b";
                } else if (numbers == 3) {
                    message += "c";
                }
            } else if (buttonNumber == '3') {
                if (numbers == 1) {
                    message += "d";
                } else if (numbers == 2) {
                    message += "e";
                } else if (numbers == 3) {
                    message += "f";
                }
            } else if (buttonNumber == '4') {
                if (numbers == 1) {
                    message += "g";
                } else if (numbers == 2) {
                    message += "h";;
                } else if (numbers == 3) {
                    message += "i";
                }
            } else if (buttonNumber == '5') {
                if (numbers == 1) {
                    message += "j";
                } else if (numbers == 2) {
                    message += "k";
                } else if (numbers == 3) {
                    message += "l";
                }
            } else if (buttonNumber == '6') {
                if (numbers == 1) {
                    message += "m";
                } else if (numbers == 2) {
                    message += "n";
                } else if (numbers == 3) {
                    message += "o";
                }
            } else if (buttonNumber == '7') {
                if (numbers == 1) {
                    message += "p";
                } else if (numbers == 2) {
                    message += "q";
                } else if (numbers == 3) {
                    message += "r";
                } else if (numbers == 4) {
                    message += "s";
                }
            } else if (buttonNumber == '8') {
                if (numbers == 1) {
                    message += "t";
                } else if (numbers == 2) {
                    message += "u";
                } else if (numbers == 3) {
                    message += "v";
                }
            } else if (buttonNumber == '9') {
                if (numbers == 1) {
                    message += "w";
                } else if (numbers == 2) {
                    message += "x";
                } else if (numbers == 3) {
                    message += "y";
                } else if (numbers == 4) {
                    message += "z";
                }
            } else if (buttonNumber == '0') {
                message += " ";
            }
        }
        System.out.println(message);
    }
}
