package prac3java;

import java.util.Scanner;

public class N1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        scanner.close();
        if (x1==x2 && x2==x3){
            System.out.println("yes");
            return;
        }
        System.out.println("no");
    }
}
