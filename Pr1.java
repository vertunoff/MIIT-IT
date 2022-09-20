import java.util.Scanner;

class Pr1 {
    public static void main(String[] args) {
        System.out.print("Введите количество вагонов (положительное целое число): ");
        Scanner scanner = new Scanner(System.in);
        try {
            Double quantity = Double.parseDouble(scanner.nextLine());
            scanner.close();
            System.out.println(Math.round(quantity * 75));
        } catch (Exception e) {
            System.out.println("Ошибка!");
            main(args);
        }

    }
}