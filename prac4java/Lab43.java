import java.util.Scanner;
public class Lab43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        String t = type.toLowerCase();
        int wagon = scanner.nextInt();
        int places = scanner.nextInt();
        int count = wagon * places;
        if (count <= 0) {
            System.out.println("error");

        } else {
            if (t.equals("compartment")) {
                double count1 = count * 12;
                System.out.println(String.format("%.2f", count1) + "$");
            }
            if (t.equals("second-class")) {
                double count2 = count * 7.5;
                System.out.println(String.format("%.2f", count2) + "$");
            }
            if (t.equals("econom-class")) {
                double count3 = count * 5;
                System.out.println(String.format("%.2f", count3) + "$");
            }
        }



    }
}
