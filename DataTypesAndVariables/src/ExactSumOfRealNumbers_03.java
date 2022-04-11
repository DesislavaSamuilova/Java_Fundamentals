
import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNumbers_03{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigDecimal bigSum = BigDecimal.valueOf(0);

        while(n>0){
            BigDecimal tempNum =  sc.nextBigDecimal();
            bigSum = bigSum.add(tempNum);
            n--;
        }
        sc.close();
        System.out.println(bigSum);
    }
}