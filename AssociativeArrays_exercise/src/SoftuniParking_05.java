import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftuniParking_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        //"register {username} {licensePlateNumber}"
        //"unregister {username}"
        Map<String, String> parkingSystem = new LinkedHashMap<>();
        while(n > 0){
            String input = scanner.nextLine();
            String[] data = input.split("\\s+");

            switch(data[0]){
                case "register":
                    register(data, parkingSystem);
                    break;
                case "unregister":
                    unregister(data, parkingSystem);
                    break;
            }
            n--;
        }
        parkingSystem.forEach((k, v) -> System.out.println(k + " => " + v));

    }

    private static void unregister(String[] data, Map<String, String> parkingSystem) {
        String username = data[1];
        /* if(!parkingSystem.containsKey(username)){ */
        String currentRegistration = parkingSystem.get(username);
        if(currentRegistration == null){
            System.out.printf("ERROR: user %s not found%n", username);
        }else{
            System.out.printf("%s unregistered successfully%n", username);
            parkingSystem.remove(username);
        }
    }

    private static void register(String[] data, Map<String, String> parkingSystem) {
        String username = data[1];
        String licensePlateNumber = data[2];
        String currentRegistration = parkingSystem.get(username);
        if(currentRegistration == null){
            parkingSystem.put(username, licensePlateNumber);
            System.out.printf("%s registered %s successfully%n", username, licensePlateNumber);
        }else{
            System.out.printf("ERROR: already registered with plate number %s%n", licensePlateNumber);
        }
    }
}
