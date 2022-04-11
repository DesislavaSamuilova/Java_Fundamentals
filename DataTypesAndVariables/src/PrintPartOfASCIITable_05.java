import java.util.Scanner;

public class PrintPartOfASCIITable_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startIndex = Integer.parseInt(scanner.nextLine());
        int lastIndex = Integer.parseInt(scanner.nextLine());
        for (int i = startIndex; i <= lastIndex; i++){

            System.out.print(((char)i  + " "));
        }

    }
}
