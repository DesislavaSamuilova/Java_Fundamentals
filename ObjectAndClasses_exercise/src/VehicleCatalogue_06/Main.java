package VehicleCatalogue_06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Catalogue> catalogues = new ArrayList<>();

        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");
            String type = tokens[0];
            String model = tokens[1];
            String color = tokens[2];
            int horsePower = Integer.parseInt(tokens[3]);

            Catalogue catalogue = new Catalogue();
            catalogue.setType(type);
            catalogue.setModel(model);
            catalogue.setColor(color);
            catalogue.setHorsePower(horsePower);

            catalogues.add(catalogue);

            input = scanner.nextLine();
        }
        String model  = scanner.nextLine();
        while (!model.equals("Close the Catalogue")) {
            String finalModel = model;
            catalogues.stream().filter(c -> c.getModel().equals(finalModel))
                    .forEach(System.out::println);
            model = scanner.nextLine();
        }
        System.out.println(String.format("Cars have average horsepower of: %.2f.",
                average(catalogues.stream()
                .filter(v -> v.getType().equals("car"))
                .collect(Collectors.toList()))));

        System.out.println(String.format("Trucks have average horsepower of: %.2f.",
                average(catalogues.stream()
                .filter(v -> v.getType().equals("truck"))
                .collect(Collectors.toList()))));

    }
    private static double average(List<Catalogue> catalogues) {
        if (catalogues.size() == 0) {
            return 0.0;
        }
        double sum = 0;
        for (Catalogue catalogue : catalogues) {
            sum += catalogue.getHorsePower();
        }
         return sum / catalogues.size();
    }
}

