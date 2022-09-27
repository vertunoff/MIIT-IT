package prac2java;

import java.util.Scanner;

public class N4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        scanner.close();
        System.out.println(a.replaceAll("\\s", "").toUpperCase());
    }
}
