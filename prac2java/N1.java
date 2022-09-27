package prac2java;

import java.util.Scanner;

public class N1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char a = scanner.nextLine().charAt(0);
        char b = scanner.nextLine().charAt(0);
        scanner.close();
        int x = (int) a;
        int y = (int) b;
        System.out.println(Math.abs(x - y));
    }
}
