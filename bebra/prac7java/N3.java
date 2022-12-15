package prac7java;

import java.util.Scanner;

public class N3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int mn1 = min(a, b);
        int mn2 = min(c, d);
        System.out.println(min(mn1, mn2));
    }

    static int min(int x, int y) {
        return (x < y ? x : y);
    }
}
