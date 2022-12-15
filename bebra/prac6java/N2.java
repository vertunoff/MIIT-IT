package prac6java;

import java.util.Scanner;

public class N2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n <= 0){
            System.out.println("error");
            return;
        }
        boolean same = true;
        int max_dif = -1;
        int q1 = scanner.nextInt();
        int q2 = scanner.nextInt();
        int old_sumq = q1 + q2;
        for (int i = 0; i < n - 1; i++) {
            q1 = scanner.nextInt();
            q2 = scanner.nextInt();
            int sumq = q1 + q2;
            int dif = Math.abs(sumq - old_sumq);
            if (dif > 0) {
                same = false;
                max_dif = max_dif > dif ? max_dif : dif;
            }
            old_sumq = sumq;
        }
        if (same) {
            System.out.printf("Yes, value = %s", old_sumq);
        } else {
            System.out.printf("No, maxfdiff = %s", max_dif);
        }
    }
}
