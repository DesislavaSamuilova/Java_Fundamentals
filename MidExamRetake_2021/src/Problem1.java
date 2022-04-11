import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int journey = Integer.parseInt(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());

        double savedMoney = 0;
        double sum = 0;

        for (int i = 1; i <= months; i++) {
            if (i % 2 == 1 && i != 1) {
                savedMoney -= savedMoney * 0.16;
            }
            if (i % 4 == 0) {
                savedMoney += savedMoney * 0.25;
            }
            savedMoney += journey * 0.25;
        }
        if(savedMoney >= journey){
            double moreMoney = savedMoney - journey;
            System.out.printf("Bravo! You can go to Disneyland and you will have %.2flv. for souvenirs.", moreMoney);
        }
        else{
           double diff = journey - savedMoney;
            System.out.printf("Sorry. You need %.2flv. more.", diff);
        }
    }
}
