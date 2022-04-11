import java.util.Scanner;

public class LowerOrUpper_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String letter = scanner.nextLine();
        if(letter == letter.toLowerCase()){
            System.out.println("lower-case");
        }
         if(letter ==letter.toUpperCase()){
            System.out.println("upper-case");
        }
    }
}
