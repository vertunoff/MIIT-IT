import java.util.Scanner;
public class N2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine().toLowerCase();
        if (name.equals("square")) {
            double a = scanner.nextDouble();
            if (a <= 0) {
                System.out.println("error");
            } else {
                System.out.println(String.format("%.3f",(a * a)));
            }
        }
        if (name.equals("rectangle")) {
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            double square = x * y;
            if (square <= 0) {
                System.out.println("error");
            } else {

                System.out.printf("%.3f",square);
            }
        }
        if (name.equals("circle")) {
            double r = scanner.nextDouble();
            if (r <= 0) {
                System.out.println("error");
            } else {
                System.out.printf("%.3f",(Math.PI*r*r));
            }
        }
        if (name.equals("triangle")) {
            double a = scanner.nextDouble();
            double h = scanner.nextDouble();
            double square = ((a * h) / 2);
            if (square <= 0) {
                System.out.println("error");
            } else {
                System.out.printf("%.3f", square);
            }
        }
    }
}


