import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> schedule = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("course start")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            String lessonTitle = tokens[1];
            switch (command) {
                case "Add":
                    if (!schedule.contains(lessonTitle)) {
                        schedule.add(lessonTitle);
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(tokens[2]);
                    if (!schedule.contains(lessonTitle)) {
                        schedule.add(index, lessonTitle);
                    }
                    break;
                case "Remove":
                    if (schedule.contains(lessonTitle)) {
                        schedule.remove(lessonTitle);
                    }
                    int indexLesson = schedule.indexOf(lessonTitle);
                    if(schedule.get(indexLesson+1).equals(lessonTitle + "-Exercise")){
                        schedule.remove(indexLesson + 1);
                    }
                    break;
                case "Swap":
                    String lessonTitle2 = tokens[2];
                    String exercise1 = lessonTitle + "-Exercise";
                    String exercise2 = lessonTitle2 + "-Exercise";
                    if (schedule.contains(lessonTitle) && schedule.contains(lessonTitle2)) {
                        int index1 = schedule.indexOf(lessonTitle);
                        int index2 = schedule.indexOf(lessonTitle2);
                        schedule.set(index1, lessonTitle2);
                        schedule.set(index2,lessonTitle);

                        if(schedule.get(index1 + 1).equals(exercise1)){
                            schedule.remove(index2 + 1);
                            schedule.add(index2 + 1 , exercise1);
                        }
                        if(index2 != schedule.size() -1 && schedule.get(index2 + 1).equals(exercise2)){
                            schedule.remove(index1 + 1);
                            schedule.add(index2 + 1 , exercise2);
                        }
                    }

                    break;
                case "Exercise":
                    String exercise = lessonTitle + "-Exercise";
                    int indexLessonTitle = schedule.indexOf(lessonTitle);
                    if (schedule.contains(lessonTitle)) {
                        if (indexLessonTitle == schedule.size() - 1) {
                            schedule.add(indexLessonTitle + 1, exercise);
                        } else if (!schedule.get(indexLessonTitle + 1).equals(exercise)) {
                            schedule.add(indexLessonTitle + 1, exercise);
                        }
                    } else {
                        schedule.add(lessonTitle);
                        schedule.add(exercise);
                    }

            }
            input = scanner.nextLine();
        }
        int count = 1;
        for (String element : schedule) {
            System.out.println(count + "." + element);
            count++;
        }


    }
}


