import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class SoftuniKaraoke_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> participants = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());
        List<String> songs = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String input = scanner.nextLine();
        int awardCount = 0;

        while (!input.equals("dawn")) {
            String[] tokens = input.split(", ");
            String singer = tokens[0];
            String song = tokens[1];
            String award = tokens[2];
            String nameOfSinger = "";
            if (participants.contains(singer) && songs.contains(song)) {
                awardCount++;
                participants.add(singer);
                songs.add(song);
                } else if (!participants.contains(singer) && !songs.contains(song)) {
                    break;
                }

                input = scanner.nextLine();

        }
        for (String song : songs) {
            System.out.printf("%s: %s awards%n", participants, awardCount);
            //  System.out.printf("--%s");
        }
    }
}


