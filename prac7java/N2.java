package prac7java;

import java.util.Scanner;

public class N2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        System.out.println(area(x1, y1, x2, y2));

    }

    static int area(int x1, int y1, int x2, int y2) {
        return Math.abs(x1 - x2) * Math.abs(y1 - y2);
    }
}
