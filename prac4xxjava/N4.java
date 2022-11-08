import java.util.Scanner;

public class N4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine().toLowerCase();
        String day = scanner.nextLine().toLowerCase();
        double kg = scanner.nextDouble();
        double count = 0;
        if (!(day.matches("monday|tuesday|wednesday|thursday|friday|saturday|sunday")
                && fruit.matches("banana|apple|orange|grape fruit|kiwi|pineapple|grapes")
                && kg >= 0)) {
            System.out.println("error");
            return;
        }
        if (!day.matches("saturday|sunday")) {
            if (fruit.equals("banana")) {
                count = kg * 2.50;
            } else if (fruit.equals("apple")) {
                count = kg * 1.20;
            } else if (fruit.equals("orange")) {
                count = kg * 0.85;
            } else if (fruit.equals("grape fruit")) {
                count = kg * 1.45;
            } else if (fruit.equals("kiwi")) {
                count = kg * 1.20;
            } else if (fruit.equals("pineapple")) {
                count = kg * 5.50;
            } else if (fruit.equals("grapes")) {
                count = kg * 3.85;
            }
        } else {
            if (fruit.equals("banana")) {
                count = kg * 2.70;
            } else if (fruit.equals("apple")) {
                count = kg * 1.25;
            } else if (fruit.equals("orange")) {
                count = kg * 0.90;
            } else if (fruit.equals("grape fruit")) {
                count = kg * 1.60;
            } else if (fruit.equals("kiwi")) {
                count = kg * 3.00;
            } else if (fruit.equals("pineapple")) {
                count = kg * 5.60;
            } else if (fruit.equals("grapes")) {
                count = kg * 4.20;
            }
        }
        System.out.println(String.format("%.2f", count));
    }
}