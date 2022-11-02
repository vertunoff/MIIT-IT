import java.util.Scanner;
public class Lab44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String fr = fruit.toLowerCase();
        String dayofweek = scanner.nextLine();
        String dow = dayofweek.toLowerCase();
        double kg = scanner.nextDouble();
        if ((dow.equals("monday")) || (dow.equals("tuesday")) || (dow.equals("wednesday")) || (dow.equals("thursday")) || (dow.equals("friday")) || (dow.equals("saturday")) || (dow.equals("sunday"))) {
            if ((dow.equals("monday")) || (dow.equals("tuesday")) || (dow.equals("wednesday")) || (dow.equals("thursday")) || (dow.equals("friday"))) {
                if (kg < 0) {
                    System.out.println("error");

                } else {
                    if ((fr.equals("banana")) || (fr.equals("apple")) || (fr.equals("orange")) || (fr.equals("grape fruit")) || (fr.equals("kiwi")) || (fr.equals("pineapple") || (fr.equals("grapes")))) {
                        if (fr.equals("banana")) {
                            double count1 = kg * 2.50;
                            System.out.println(String.format("%.2f", count1));

                        }
                        if (fr.equals("apple")) {
                            double count2 = kg * 1.20;
                            System.out.println(String.format("%.2f", count2));
                        }
                        if (fr.equals("orange")) {
                            double count3 = kg * 0.85;
                            System.out.println(String.format("%.2f", count3));
                        }
                        if (fr.equals("grape fruit")) {
                            double count4 = kg * 1.45;
                            System.out.println(String.format("%.2f", count4));
                        }
                        if (fr.equals("kiwi")) {
                            double count5 = kg * 1.20;
                            System.out.println(String.format("%.2f", count5));
                        }
                        if (fr.equals("pineapple")) {
                            double count6 = kg * 5.50;
                            System.out.println(String.format("%.2f", count6));
                        }
                        if (fr.equals("grapes")) {
                            double count7 = kg * 3.85;
                            System.out.println(String.format("%.2f", count7));
                        }
                    } else {
                        System.out.println("error");
                    }
                }
            }

            if ((dow.equals("saturday")) || (dow.equals("sunday"))) {
                if (kg < 0) {
                    System.out.println("error");

                } else {
                    if ((fr.equals("banana")) || (fr.equals("apple")) || (fr.equals("orange")) || (fr.equals("grape fruit")) || (fr.equals("kiwi")) || (fr.equals("pineapple") || (fr.equals("grapes")))) {
                        if (fr.equals("banana")) {
                            double count1 = kg * 2.70;
                            System.out.println(String.format("%.2f", count1));

                        }
                        if (fr.equals("apple")) {
                            double count2 = kg * 1.25;
                            System.out.println(String.format("%.2f", count2));
                        }
                        if (fr.equals("orange")) {
                            double count3 = kg * 0.90;
                            System.out.println(String.format("%.2f", count3));
                        }
                        if (fr.equals("grape fruit")) {
                            double count4 = kg * 1.60;
                            System.out.println(String.format("%.2f", count4));
                        }
                        if (fr.equals("kiwi")) {
                            double count5 = kg * 3.00;
                            System.out.println(String.format("%.2f", count5));
                        }
                        if (fr.equals("pineapple")) {
                            double count6 = kg * 5.60;
                            System.out.println(String.format("%.2f", count6));
                        }
                        if (fr.equals("grapes")) {
                            double count7 = kg * 4.20;
                            System.out.println(String.format("%.2f", count7));
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