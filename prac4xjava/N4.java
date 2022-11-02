import java.util.Scanner;
public class N4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine().toLowerCase();
        String day = scanner.nextLine().toLowerCase();
        double kg = scanner.nextDouble();
        if (!((day.equals("monday")) || (day.equals("tuesday")) || (day.equals("wednesday")) || (day.equals("thursday")) || (day.equals("friday")) || (day.equals("saturday")) || (day.equals("sunday"))) || (kg < 0)) {
            System.out.println("error");
            return;
        }
        if (!((fruit.equals("banana")) || (fruit.equals("apple")) || (fruit.equals("orange")) || (fruit.equals("grape fruit")) || (fruit.equals("kiwi")) || (fruit.equals("pineapple") || (fruit.equals("grapes"))))){
            System.out.println("error");
            return;
        }
        if ((day.equals("monday")) || (day.equals("tuesday")) || (day.equals("wednesday")) || (day.equals("thursday")) || (day.equals("friday"))) {
                        if (fruit.equals("banana")) {
                            double count = kg * 2.50;
                            System.out.println(String.format("%.2f", count));

                        }
                        else if (fruit.equals("apple")) {
                            double count = kg * 1.20;
                            System.out.println(String.format("%.2f", count));
                        }
                        else if (fruit.equals("orange")) {
                            double count = kg * 0.85;
                            System.out.println(String.format("%.2f", count));
                        }
                        else if (fruit.equals("grape fruit")) {
                            double count = kg * 1.45;
                            System.out.println(String.format("%.2f", count));
                        }
                        else if (fruit.equals("kiwi")) {
                            double count = kg * 1.20;
                            System.out.println(String.format("%.2f", count));
                        }
                        else if (fruit.equals("pineapple")) {
                            double count = kg * 5.50;
                            System.out.println(String.format("%.2f", count));
                        }
                        else if (fruit.equals("grapes")) {
                            double count = kg * 3.85;
                            System.out.println(String.format("%.2f", count));
                        }
                    }
                }
            if ((day.equals("saturday")) || (day.equals("sunday"))) {
                    if ((fruit.equals("banana")) || (fruit.equals("apple")) || (fruit.equals("orange")) || (fruit.equals("grape fruit")) || (fruit.equals("kiwi")) || (fruit.equals("pineapple") || (fruit.equals("grapes")))) {
                        if (fruit.equals("banana")) {
                            double count = kg * 2.70;
                            System.out.println(String.format("%.2f", count));

                        }
                        if (fruit.equals("apple")) {
                            double count = kg * 1.25;
                            System.out.println(String.format("%.2f", count));
                        }
                        if (fruit.equals("orange")) {
                            double count = kg * 0.90;
                            System.out.println(String.format("%.2f", count));
                        }
                        if (fruit.equals("grape fruit")) {
                            double count = kg * 1.60;
                            System.out.println(String.format("%.2f", count));
                        }
                        if (fruit.equals("kiwi")) {
                            double count = kg * 3.00;
                            System.out.println(String.format("%.2f", count));
                        }
                        if (fruit.equals("pineapple")) {
                            double count = kg * 5.60;
                            System.out.println(String.format("%.2f", count));
                        }
                        if (fruit.equals("grapes")) {
                            double count = kg * 4.20;
                            System.out.println(String.format("%.2f", count));
                        }
                    } else {
                        System.out.println("error");
                    }
                }


            }
        } else {
            System.out.println("error");
        }
    }
}