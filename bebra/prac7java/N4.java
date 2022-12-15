package prac7java;
import java.util.Scanner;

public class N4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        double ans = factorial(n) / (factorial(k) * factorial(n-k));
        System.out.println(Math.round(ans));
    }

    static double factorial(int a) {
        if (a <= 1)
            return 1;
        else
            return a * factorial(a - 1);
    }
}
