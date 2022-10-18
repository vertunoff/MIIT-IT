package prac3java;

import java.util.Scanner;

public class N3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        scanner.close();
        if (x < 0) {
            System.out.println("error");
            return;
        }
        if (x <= 40) {
            System.out.println("слишком медленно");
        } else if (x <= 80) {
            System.out.println("медленно");
        } else if (x <= 120) {
            System.out.println("оптимельно");
        } else {
            System.out.println("слишком быстро");
        }
    }
}
