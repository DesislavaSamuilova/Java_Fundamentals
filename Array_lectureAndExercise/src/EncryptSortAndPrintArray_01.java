import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            char[] letter = scanner.next().toCharArray();
            for (char let : letter) {
                if (let == 'a' || let == 'e' || let == 'i' || let == 'o' ||
                        let == 'u'|| let == 'A'|| let == 'E'||  let == 'I'||
                        let == 'O'||let == 'U') {
                    let *= letter.length;
                    sum += let;
                } else {
                    let /= letter.length;
                    sum += let;
                }
            }
            numbers[i] = sum;
            sum = 0;
        }
        Arrays.sort(numbers);
        for (int element : numbers) {
            System.out.println(element);
        }
    }
}
