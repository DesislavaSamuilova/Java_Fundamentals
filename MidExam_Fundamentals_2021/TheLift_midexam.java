import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TheLift_midexam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int waitingPeople = Integer.parseInt(scanner.nextLine());
        int[] currentState = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int peopleCurrentWag = 0;
        int peopleOnLift = 0;
        boolean noMorePeople = false;

        for (int i = 0; i < currentState.length; i++) {
            while (currentState[i] < 4) {
                currentState[i]++;
                peopleCurrentWag++;
                if (peopleOnLift + peopleCurrentWag == waitingPeople) {
                    noMorePeople = true;
                    break;
                }
            }
            peopleOnLift += peopleCurrentWag;
            if (noMorePeople) {
                break;
            }
            peopleCurrentWag = 0;
            if (waitingPeople > peopleOnLift) {
                int noSpace = waitingPeople - peopleOnLift;
                System.out.printf("There isn't enough space! %d people in a queue!%n", noSpace);
                System.out.printf(" ", currentState[i]);
            } else if (waitingPeople < currentState.length * 4 && currentState.length < 4) {
                System.out.printf("The lift has empty spots!");
                for (int i1 : currentState) {
                    System.out.printf(" ", currentState[i]);
                }
            }else if(currentState.length == 4 && noMorePeople ==true){
                System.out.printf(" ", currentState[i]);
            }
        }
    }
}