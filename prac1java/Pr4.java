package prac1java;

import java.util.Scanner;

public class Pr4 {
    public static void main(String[] args) {
        double kg = 227 * 2.940 * 12.692 * 2.425;
        Scanner scanner = new Scanner(System.in);
        double price = Double.parseDouble(scanner.nextLine());
        scanner.close();
        System.out.printf("%.2f", kg * price * 0.97);

    }
}
