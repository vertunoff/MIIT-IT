import java.util.Scanner;

public class Pr3 {
    public static void main(String[] args) {
        System.out.println("Введите размеры вагона (неотрицательные числа): ");
        Scanner scanner = new Scanner(System.in);
        try {
            Double x = Double.parseDouble(scanner.nextLine());
            Double y = Double.parseDouble(scanner.nextLine());
            Double z = Double.parseDouble(scanner.nextLine());
            scanner.close();
            System.out.printf("%.1f", x * y * z / 1000000000);
        } catch (Exception e) {
            System.out.println("Ошибка!");
            main(args);
        }
    }
}
