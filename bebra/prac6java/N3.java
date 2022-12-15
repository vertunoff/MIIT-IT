package prac6java;


import java.util.Scanner;

public class N3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rest = 0;
        String n = scanner.nextLine();
        while (!n.toLowerCase().equals("end")) {
            String s = scanner.nextLine();
            if (s.toLowerCase().equals("end"))
                break;
            int ints = Integer.parseInt(s);
            int ss = 0;
            while (ss < ints) {
                String x = scanner.nextLine();
                if (x.toLowerCase().equals("end")) {
                    rest = ss;
                    break;
                }
                int intx = Integer.parseInt(x) + rest;
                if (intx - rest < 0) {
                    System.out.println("can not be negative, enter again");
                    continue;
                }
                ss += intx;
            }
            if (ss >= ints) {
                System.out.printf("Going to %s!", n);
                System.out.println();
                rest = ss - ints;
            }
            n = scanner.nextLine();

        }
    }
}
