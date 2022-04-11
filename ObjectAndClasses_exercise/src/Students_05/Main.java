package Students_05;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String studentsData = scanner.nextLine();
            String[] splittedData = studentsData.split("\\s+");
            String firstName = splittedData[0];
            String lastName = splittedData[1];
            double grade = Double.parseDouble(splittedData[2]);

            Student student = new Student(firstName, lastName, grade);
            students.add(student);
        }
        //nov list ot studenti - vzema list ot studenti puska stream po tqh
      //  sortira gi po nachin kato iskame da vzema ocenka i posle go reverse
             //   poluchenoto go preobrazuva v list i go suhranqva v sortedList
        List<Student> sortedList = students.stream().sorted(Comparator.comparing
                (Student::getGrade).reversed()).collect(Collectors.toList());
            for (Student student : sortedList) {
            System.out.println(student);
        }
    }
}
