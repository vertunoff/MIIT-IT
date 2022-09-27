package prac1java;

import java.util.Scanner;

public class Pr2 {
    public static void main(String[] args) {
        double mainn = 21.7 * 2;
        double len = 13.92;
        Scanner scanner = new Scanner(System.in);
        int quantity = Integer.parseInt(scanner.nextLine());
        scanner.close();
        System.out.println(Math.round(len * quantity + mainn));
    }
}
