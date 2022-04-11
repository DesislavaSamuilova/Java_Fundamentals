import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String values = scan.nextLine();
        List<String> names = Arrays.stream(values.split(",\\s+"))
                .collect(Collectors.toList());
        values = scan.nextLine();
        int counter = -1;
        String word = "Out of stock";
        while (!values.equals("Eat")) {
            String[] command = values.split("\\s+");
            String tokens1 = command[0];
            String tokens2 = command[1];

            switch (tokens1) {

                case "Update-Any":
                    if (names.contains(tokens2)) {
                        for (int i = 0; i < names.size(); i++) {
                            counter = -1;
                            for (String n : names) {
                                counter = counter + 1;
                                if (tokens2.equals(n)) {
                                    int index = i + counter;
                                    names.remove(index);
                                    names.add(index, word);
                                    counter = -1;
                                    break;
                                }
                            }
                        }
                    } else {
                        break;
                    }
                    break;
                case "Update-Last":
                    if (names.isEmpty()) {
                        break;
                    }
                    String lastIndex = names.remove(names.size() - 1);
                    names.add(tokens2);
                    break;
                case "Remove":
                    int biscuitsIndex = Integer.parseInt(command[2]);
                    if (biscuitsIndex < names.size() && biscuitsIndex >= 0) {
                        for (int i = 0; i < names.size(); i++) {
                            counter = -1;
                            String oldIndex = names.get(biscuitsIndex);
                            for (String n : names) {
                                counter = counter + 1;
                                if (n.equals(oldIndex)) {
                                    names.remove(oldIndex);
                                    names.add(biscuitsIndex, tokens2);
                                    break;
                                }
                            }
                        }
                    }
                    break;
                case "Rearrange":
                    if (names.contains(tokens2)) {
                        names.remove(tokens2);
                        names.add(tokens2);
                    }
                    break;
            }
            values = scan.nextLine();
        }
        boolean flag = true;
        for (int i = 0; i < names.size(); i++) {
            names.remove(word);
        }
            if (flag) {
                System.out.println(names.toString().replaceAll("[\\[\\],]", ""));
            }
            flag = true;

        }

}
