package prac6java;

import java.util.Scanner;

public class N4 {
    public static void main(String[] args) {
        int primes = 0;
        int nonprimes = 0;
        Scanner scanner = new Scanner(System.in);
        String strs = scanner.nextLine();
        while (!strs.toLowerCase().equals("stop")) {
            int s = Integer.parseInt(strs);
            boolean prime = true;
            if (s < 0)
                System.out.println("Number is negative");
            else if (s == 0)
                System.out.println("Number is zero");
            else if (s == 1)
                System.out.println("One is niether prime nor non prime");
            else {
                for (int i = 2; i < s / 2 + 1; i += 2) {
                    if (s % i == 0) {
                        prime = false;
                    }
                }
                if (prime)
                    primes += s;
                else
                    nonprimes += s;
            }
            strs = scanner.nextLine();
        }
        System.out.println("Sum of all prime numbers is: " + primes);
        System.out.println("Sum of all non prime numbers is: " + nonprimes);
    }
}
