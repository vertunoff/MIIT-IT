package prac5java;

import java.util.Scanner;

public class N1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        if (n <= 0) {
            System.out.println("error");
            return;
        }
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            if (x > max)
                max = x;
        }
        System.out.println(max);
    }
}
