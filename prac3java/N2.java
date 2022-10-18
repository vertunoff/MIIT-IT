package prac3java;

import java.util.Scanner;

public class N2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        scanner.close();
        if (!(1<=x1 && x1<=60) || !(1<=x1 && x1<=60) || !(1<=x1 && x1<=60)){
            System.out.println("error");
            return;
        }
        int t = (x1+x2+x3);

        System.out.println(t / 60 + ":" + (t%60< 10? "0" +t%60 : t%60));

    }
}
