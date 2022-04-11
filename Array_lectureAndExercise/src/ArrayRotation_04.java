import java.util.Scanner;

public class ArrayRotation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(" ");
        int rotation = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < rotation; i++) {
            // vinagi 0 elem go mestim i go slagame otzad
            String current = array[0];
            // mestim elem nalqvo za da osvobodim poslednoto mqsto
            for (int j = 0; j < array.length - 1; j++) {
                //sledvashtiq go mestim na purvoto
                array[j] = array[j + 1];
            }
            array[array.length-1] = current;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
