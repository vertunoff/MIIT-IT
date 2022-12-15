package prac5java;

import java.util.Scanner;

public class N4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        for (int i = x; i <= y; i += 3) {
            System.out.println(i);
        }
    }
}
