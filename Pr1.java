import java.util.Scanner;

class Pr1 {
    public static void main(String[] args) {
        System.out.print("Введите количество вагонов (положительное целое число): ");
        Scanner scanner = new Scanner(System.in);
        try {
            int quantity = Integer.parseInt(scanner.nextLine());
            scanner.close();
            System.out.println(quantity * 75);
        } catch (Exception e) {
            System.out.println("Ошибка!");
            main(args);
        }

    }
}
