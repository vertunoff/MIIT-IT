package prac5java;

import java.util.Scanner;

public class N3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        while (!((x <= 500 && x >= -500) || (x <= 1500 && x >= 1000))) {
            System.out.println("Not yet");
            x = scanner.nextInt();
        }
        System.out.println("Correct number: " + x);
    }
}
