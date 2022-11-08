import java.util.Scanner;

public class N1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sign = scanner.nextLine();
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double res;
        switch(sign){
            case "+":
                res = x+y;
                break;
            case "-":
                res = x-y;
                break;
            case "x":
                res = x*y;
                break;
            case "/":
                if (y == 0){
                    System.out.println("division by zero");
                }
                else{
                    System.out.printf("%.3f / %.3f = %.3f", x, y, x/y);
                }
                return;
            case "^":
                res = Math.pow(x, y);
                break;
            default:
                System.out.println("error");
                return;
        }
        String ans = (x + " " + sign + " " + y + " = " + res);
        ans = ans.replace(".0", "");
        System.out.println(ans);

    }
}
