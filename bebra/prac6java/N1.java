package prac6java;

import java.util.Scanner;

public class N1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tofind = scanner.nextLine().toLowerCase();
        int q = Integer.parseInt(scanner.nextLine());
        if (q <= 0){
            System.out.println("error");
            return;
        }
        for (int i = 1; i <= q; i++) {
            String book = scanner.nextLine().toLowerCase();
            if (book.equals(tofind)) {
                System.out.printf("You checked %s books and found: %s", i, tofind);

            } else if (i == q) {
                System.out.printf("The book you search is not here! You checked %s books", i);
            }
        }
    }
}
