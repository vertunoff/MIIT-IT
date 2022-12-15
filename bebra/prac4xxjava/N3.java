import java.util.Scanner;

public class N3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine().toLowerCase();
        int n = scanner.nextInt();
        int places = scanner.nextInt();
        if (places < 0 || n < 0) {
            System.out.println("error");
        }
        double cost = n * places;
        switch (type) {
            case "compartment":
                cost *= 12;
                break;
            case "second-class":
                cost *= 7.5;
                break;
            case "econom-class":
                cost *= 5;
                break;
            default:
                System.out.println("error");
                return;
        }
        System.out.printf("%.2f $", cost);
    }
}
