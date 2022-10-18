package prac3java;

import java.util.Scanner;

public class N4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble() * 100 / 30.48;
        scanner.close();
        if (x < 0) {
            System.out.println("error");
            return;
        }
        if (x <= 15) {
            System.out.println(10);
        } else if (x <= 25) {
            System.out.println(20);
        } else if (x <= 35) {
            System.out.println(30);
        } else {
            System.out.println(40);
        }
    }
}
