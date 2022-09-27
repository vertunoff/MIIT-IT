package prac1java;

import java.util.Scanner;

public class Pr3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double x = Double.parseDouble(scanner.nextLine());
        Double y = Double.parseDouble(scanner.nextLine());
        Double z = Double.parseDouble(scanner.nextLine());
        scanner.close();
        System.out.printf("%.1f", x * y * z / 1000000000);

    }
}
