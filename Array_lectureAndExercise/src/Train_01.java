import java.util.Scanner;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] num = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            num[i] = number;
            sum = sum + num[i];
         }

        for (int i = 0; i <= num.length - 1; i++) {

            System.out.print(num[i] + " ");

        }
        System.out.println();
        System.out.println(sum);


    }
}

