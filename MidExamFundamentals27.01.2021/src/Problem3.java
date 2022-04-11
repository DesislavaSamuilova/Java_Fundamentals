import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        int entryPoint = Integer.parseInt(scan.nextLine());

        String typeItems = scan.nextLine();
        int right = 0;
        int left = 0;
        for (int i = 0; i < list.size(); i++) {
            int index = list.get(i);
            if (i < entryPoint) {
                left += index;
            } else {
                break;
            }
        }

        for (int i = 0; i < list.size(); i++) {
            int index = list.get(i);
            if (i > entryPoint) {
                right += index;
            }

        }


        switch (typeItems) {

            case "cheap":
                if (left < right || left == right) {
                    System.out.printf("Left - %d", left);
                    break;
                }
                if (left > right || left == right) {
                    System.out.printf("Right - %d", left);
                    break;
                }
                break;
            case "expensive":
                if (right > left || right == left) {
                    System.out.printf("Right - %d", right);
                    break;
                }
                if (right < left || right == left) {
                    System.out.printf("Left - %d", left);
                    break;
                }
                break;
        }
    }

}