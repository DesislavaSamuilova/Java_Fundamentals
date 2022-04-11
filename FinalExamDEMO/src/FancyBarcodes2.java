import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberBarcodes = Integer.parseInt(scanner.nextLine());
        String regex = "@#+(?<product>[A-Z][a-zA-Z0-9]{4,}[A-Z])@#+";

        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < numberBarcodes; i++) {
            String barcode = scanner.nextLine();
            Matcher matcher = pattern.matcher(barcode);
            if(matcher.find()){
                String product = matcher.group("product");
                String productGroup = "";
                for (int index = 0; index <= product.length()-1; index++) {
                    char currSymbol = product.charAt(index);
                    if(Character.isDigit(currSymbol)){
                        productGroup+=currSymbol;
                    }
                }
                if(productGroup.equals("")){
                    System.out.println("Product group: 00");
                }else {
                    System.out.println("Product group: " + productGroup);
                }
            } else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
