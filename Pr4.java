import java.util.Scanner;

public class Pr4 {
    public static void main(String[] args) {
        double kg = 227 * 2.940 * 12.692 * 2.425;
        System.out.print("Введите цену (неотрицательное число): ");
        Scanner scanner = new Scanner(System.in);
        try {
            double price = Double.parseDouble(scanner.nextLine());
            scanner.close();
            System.out.printf("%.2f", kg * price * 0.97);
        } catch (Exception e) {
            System.out.println("Ошибка!");
            main(args);
        }
    }
}
