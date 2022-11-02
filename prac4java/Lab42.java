import java.util.Scanner;
public class Lab42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();
        String fig = figure.toLowerCase();
        if (fig.equals("square")) {
            double a = scanner.nextDouble();
            if (a <= 0) {
                System.out.println("error");
            } else {
                System.out.println(String.format("%.3f",(a * a)));

            }
        }
        if (fig.equals("rectangle")) {
            double width = scanner.nextDouble();
            double length = scanner.nextDouble();
            double size = width * length;
            if (size <= 0) {
                System.out.println("error");
            } else {

                System.out.println(String.format("%.3f",size));
            }


        }
        if (fig.equals("circle")) {
            double r = scanner.nextDouble();
            if (r <= 0) {
                System.out.println("error");
            } else {
                System.out.println(String.format("%.3f",(Math.PI * (r * r))));
            }

        }
        if (fig.equals("triangle")) {
            double len = scanner.nextDouble();
            double high = scanner.nextDouble();
            double size1 = ((len * high) / 2);
            if (size1 <= 0) {
                System.out.println("error");
            } else {
                System.out.println(String.format("%.3f",size1 ));
            }
        }


    }
}


