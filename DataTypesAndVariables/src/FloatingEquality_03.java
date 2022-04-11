import java.util.Scanner;

public class FloatingEquality_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numberA = Double.parseDouble(scanner.nextLine());
        double numberB = Double.parseDouble(scanner.nextLine());

        double eps = 0.000001f;

        if(numberA < numberB){
            double temporary = numberA;
            numberA = numberB;
            numberB = temporary;
        }


        if(Math.abs(numberA-numberB) >= eps){
            System.out.println("False");
        }else {
            System.out.println("True");
        }
    }
}
