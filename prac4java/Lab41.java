import java.text.DecimalFormat;
import java.util.Scanner;
public class Lab41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sign = scanner.nextLine();
        double numb1 = scanner.nextDouble();
        DecimalFormat dF1 = new DecimalFormat("#.###");
        String number1 = dF1.format(numb1);
        double numb2 = scanner.nextDouble();
        DecimalFormat dF2 = new DecimalFormat("#.###");
        String number2 = dF1.format(numb2);
        double num;
        if (sign.equals("+")) {
            if (numb2 < 0) {
                System.out.println(number1 + " + " + "(" + number2 + ")" + " = " + new DecimalFormat("#.###").format(Double.parseDouble(number1) + Double.parseDouble(number2)));
            } else {
                System.out.println(number1 + " + " +  number2 +  " = " + new DecimalFormat("#.###").format(Double.parseDouble(number1) + Double.parseDouble(number2)));
            }
        }
        if (sign.equals("-")) {
            if (numb2 < 0) {
                System.out.println(number1 + " - " + "(" + number2 + ")" + " = " + new DecimalFormat("#.###").format(Double.parseDouble(number1) - Double.parseDouble(number2)));
            } else {
                System.out.println(number1 + " - " +  number2 +  " = " + new DecimalFormat("#.###").format(Double.parseDouble(number1) - Double.parseDouble(number2)));
            }
        }
        if (sign.equals("x")) {
            if (numb2 < 0) {
                System.out.println(number1 + " x " + "(" + number2 + ")" + " = " + new DecimalFormat("#.###").format(Double.parseDouble(number1) * Double.parseDouble(number2)));
            } else {
                System.out.println(number1 + " x " +  number2 +  " = " + new DecimalFormat("#.###").format(Double.parseDouble(number1) * Double.parseDouble(number2)));
            }

        }
        if (sign.equals("/")) {
            if (numb2 == 0) System.out.println("division by zero");
            else {
                if (numb2 < 0) {
                    System.out.println(number1 + " / " + "(" + number2 + ")" + " = " + new DecimalFormat("#.###").format(Double.parseDouble(number1) / Double.parseDouble(number2)));
                }else{
                    System.out.println(number1 + " / " +  number2 +  " = " + new DecimalFormat("#.###").format(Double.parseDouble(number1) / Double.parseDouble(number2)));

                }
            }
        }
        if (sign.equals("^")) {
            if (numb2 < 0) {
                System.out.println(number1 + " ^ " + "(" + number2 + ")" + " = " + new DecimalFormat("#.###").format(Math.pow(Double.parseDouble(number1),Double.parseDouble(number2))));
            } else {
                System.out.println(number1 + " ^ " +  number2 +  " = " + new DecimalFormat("#.###").format(Math.pow(Double.parseDouble(number1),Double.parseDouble(number2))));
            }
        }

    }

}
