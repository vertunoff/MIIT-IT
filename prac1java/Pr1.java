package prac1java;

import java.util.Scanner;

class Pr1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantity = Integer.parseInt(scanner.nextLine());
        scanner.close();
        System.out.println(quantity * 75);

    }
}