package prac7java;

import java.math.BigInteger;
import java.util.Scanner;

public class N4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(factorial1(6));
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        BigInteger ans = (factorial(n)).divide(factorial(k).multiply(factorial(n - k)));
        System.out.println(ans);
    }

    static long factorial1(long a) {
        if (a <= 1)
            return 1;
        else
            return a * factorial1(a - 1);
    }

    static BigInteger factorial(BigInteger a) {
        if (a.compareTo(BigInteger.TWO) == -1)
            return BigInteger.ONE;
        else
            return (a.multiply(factorial(a.subtract(BigInteger.ONE))));

    }

    static BigInteger factorial(long b) {
        BigInteger a = BigInteger.valueOf(b);
        if (a.compareTo(BigInteger.TWO) == -1)
            return BigInteger.ONE;
        else
            return (a.multiply(factorial(a.subtract(BigInteger.ONE))));
    }
}
