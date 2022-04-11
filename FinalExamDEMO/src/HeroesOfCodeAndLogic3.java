import java.time.temporal.IsoFields;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class HeroesOfCodeAndLogic3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> heroesHP = new TreeMap<>();
        Map<String, Integer> heroesMP = new TreeMap<>();

        int countHeroes = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= countHeroes; i++) {
            String input = scanner.nextLine();
            String[] heroSplit = input.split("\\s+");
            String heroName = heroSplit[0];
            int hp = Integer.parseInt(heroSplit[1]);
            int mp = Integer.parseInt(heroSplit[2]);

            if (hp <= 100) {
                heroesHP.put(heroName, hp);
            }
            if (mp <= 200) {
                heroesMP.put(heroName, mp);
            }
        }
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] enterHero = command.split(" - ");
            String commandName = enterHero[0];
            String heroName = enterHero[1];
            switch (commandName) {
                case "CastSpell":
                    int neededMP = Integer.parseInt(enterHero[2]);
                    String spellName = enterHero[3];
                    int mpCurrent = heroesMP.get(heroName);
                    if (mpCurrent >= neededMP) {
                        int leftMP = mpCurrent - neededMP;
                        heroesMP.put(heroName, leftMP);
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName, spellName, leftMP);
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                    }
                    break;
                case "TakeDamage":
                    int damage = Integer.parseInt(enterHero[2]);
                    String attacker = enterHero[3];
                    int currentDamage = heroesHP.get(heroName) - damage;
                    if (currentDamage > 0) {
                        heroesHP.put(heroName, currentDamage);
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroName, damage, attacker, currentDamage);
                    } else {
                        System.out.printf("%s has been killed by %s!%n", heroName, attacker);
                        heroesHP.remove(heroName);
                        heroesMP.remove(heroName);
                    }
                    break;
                case "Recharge":
                    int amount = Integer.parseInt(enterHero[2]);
                    int currMP = heroesMP.get(heroName);
                    int increaseMP = currMP + amount;
                    if (increaseMP > 200) {
                        increaseMP = 200;
                    }
                    heroesMP.put(heroName, increaseMP);
                    System.out.printf("%s recharged for %d MP!%n", heroName, increaseMP - currMP);
                    break;
                case "Heal":
                    int amountHP = Integer.parseInt(enterHero[2]);
                    int currHP = heroesHP.get(heroName);
                    int increaseHP = currHP + amountHP;
                    if (increaseHP > 100) {
                        increaseHP = 100;
                    }
                    heroesHP.put(heroName, increaseHP);
                    System.out.printf("%s healed for %d HP!%n", heroName, increaseHP - currHP);
                    break;
            }
            command = scanner.nextLine();
        }
        heroesHP.entrySet().stream()
                .sorted((h1, h2) -> Integer.compare(h2.getValue(), h1.getValue()))
                .forEach(hero -> {
                    String heroName = hero.getKey();
                    System.out.println(heroName);
                    System.out.println("  HP: " + hero.getValue());
                    System.out.println("  MP: " + heroesMP.get(heroName));
                });
    }
}
