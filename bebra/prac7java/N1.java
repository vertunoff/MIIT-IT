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
        //String reversed = new StringBuilder(s).reverse().toString();
        String reversed2 = "";
        for (int i = 1; i <s.length()+1; i++){
            reversed2 += s.charAt(s.length() - i);
        }
        if (s.equals(reversed2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
