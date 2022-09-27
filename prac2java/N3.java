package prac2java;

import java.util.Scanner;

public class N3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        scanner.close();
        String new_str = str.replaceAll(a, b);
        System.out.println(new_str);
    }
}
