package prac7java;

import java.util.Scanner;

public class N1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        isPalindrom(s);
    }

    static void isPalindrom(String s) {
        s = s.replace(" ", "").toLowerCase();
        String reversed = new StringBuilder(s).reverse().toString();
        if (s.equals(reversed))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
