import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactory_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sizeDNA = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int count = 0;
        int sequenceIndex = sizeDNA;
        int bestSequenceIndex = 0;
        int bestSequenceSum = 0;
        int[] sequenceDNA = new int[sizeDNA];

        while (!input.equals("Clone them!")) {
            int[] dna = Arrays.stream(scanner.nextLine().split("!+")).mapToInt(Integer::parseInt).toArray();
            int sum = 0;
            int index = sizeDNA;
            count++;
            for (int i = 0; i < dna.length; i++) {
                if (i != dna.length - 1 && dna[i] == 1 && dna[i + 1] == 1 && index == sizeDNA) {
                    index = i;
                }
                sum += dna[i];
            }
            if (index == sequenceIndex && sum > bestSequenceSum) {
                sequenceDNA = dna;
                bestSequenceIndex = count;
                bestSequenceSum = sum;
                sequenceIndex = index;
            } else if (index < sequenceIndex) {
                sequenceDNA = dna;
                bestSequenceIndex = count;
                bestSequenceSum = sum;
                sequenceIndex = index;
            }
            input = scanner.nextLine();

        }
        if (bestSequenceSum == 0) {
            bestSequenceIndex = 1;
        }
        System.out.printf("Best DNA sample %d with sum: %d.%n", bestSequenceIndex, bestSequenceSum);
        for (int value : sequenceDNA) {
            System.out.print(value + " ");

        }
    }
}

