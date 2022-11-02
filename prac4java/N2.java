import java.util.Scanner;

public class N2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sign = scanner.nextLine();
        Double x,y;
        if (sign.equalsIgnoreCase("square")){
            x = scanner.nextDouble();
            System.out.println(x*x);
        }
        else if (sign.equals("circle")){
            x = scanner.nextDouble();
            System.out.println();
        }
    }
}
