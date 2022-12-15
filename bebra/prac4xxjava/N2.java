import java.util.Scanner;

public class N2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine().toLowerCase();
        if (name.equals("square")) {
            double a = scanner.nextDouble();
            if (a < 0) {
                System.out.println("error");
                return;
            }
            System.out.println(String.format("%.3f", (a * a)));
        } else if (name.equals("rectangle")) {
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            if (x < 0 || y < 0) {
                System.out.println("error");
                return;
            }
            double square = x * y;
            System.out.printf("%.3f", square);
        } else if (name.equals("circle")) {
            double r = scanner.nextDouble();
            if (r <= 0) {
                System.out.println("error");
                return;
            }
            System.out.printf("%.3f", (Math.PI * r * r));
        } else if (name.equals("triangle")) {
            double a = scanner.nextDouble();
            double h = scanner.nextDouble();
            double square = ((a * h) / 2);
            if (a < 0 || h < 0) {
                System.out.println("error");
                return;
            }
            System.out.printf("%.3f", square);
        } else {
            System.out.println("error");
        }
    }
}
