import java.util.Scanner;

public class N1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sign = scanner.nextLine();
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double res;
        if (sign.equalsIgnoreCase("+")){
            res = x+y;
        }
        else if (sign.equalsIgnoreCase("-")){
            res = x-y;
        }
        else if (sign.equalsIgnoreCase("x")){
            res = x*y;
        }
        else if (sign.equalsIgnoreCase("/")){
            if (y == 0){
                System.out.println("division by zero");
            }
            else{
                System.out.printf("%.3f / %.3f = %.3f", x, y, x/y);

            }
            return;
        }
        else if (sign.equalsIgnoreCase("^")){
            res = Math.pow(x, y);
        }
        else{
            System.out.println("error");
            return;
        }
        System.out.println(x + " " + sign + " " + y + " = " + res);

    }
}
