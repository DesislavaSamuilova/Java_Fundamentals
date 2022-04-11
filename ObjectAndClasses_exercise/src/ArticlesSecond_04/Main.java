package ArticlesSecond_04;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Article> articles = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            String title = input.split(", ")[0];
            String content = input.split(", ")[1];
            String author = input.split(", ")[2];

            Article article = new Article(title, content, author);
            articles.add(article);
        }
        String command = scanner.nextLine();

        if (command.equals("title")) {
            articles.sort(Comparator.comparing(Article::getTitle));
            System.out.println(articles.toString().replaceAll("[\\[\\],]", ""));
        } else if (command.equals("content")) {
            articles.sort(Comparator.comparing(Article::getContent));
            System.out.println(articles.toString().replaceAll("[\\[\\],]", ""));
        } else if (command.equals("author")) {
            articles.sort(Comparator.comparing(Article::getAuthor));
            System.out.print(articles.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}
