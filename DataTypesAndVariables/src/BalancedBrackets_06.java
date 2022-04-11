import java.util.Scanner;

public class BalancedBrackets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());
        int openingBrackets = 0;
        int closingBrackets = 0;
        boolean isBalanced = true;

        for (int i = 1; i <= lines; i++) {
            String symbol = scanner.nextLine();

            if(symbol.equals("(")){
                openingBrackets++;
                if(openingBrackets - closingBrackets >=2){
                    isBalanced = false;
                    break;
                }
            }else if(symbol.equals(")")){
                closingBrackets++;

                if(closingBrackets > openingBrackets){
                    isBalanced = false;
                    break;
                }
            }

        }
        if(openingBrackets != closingBrackets){
            isBalanced = false;
        }
        if(!isBalanced){
            System.out.println("UNBALANCED");
        }else {
            System.out.println("BALANCED");
        }
    }
}
