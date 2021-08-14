package beginner;

import java.util.Scanner;

public class BhaskarasFormula {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        String in = read.nextLine();
        String out[] = in.split(" ");
        read.close();

        double A = Double.parseDouble(out[0]);
        double B = Double.parseDouble(out[1]);
        double C = Double.parseDouble(out[2]);
        double delta = Math.sqrt((B * B) - (4 * A * C));

        double x1 = (-B + delta) / (2 * A);
        double x2 = (-B - delta) / (2 * A);
        
        if (delta >= 0 && A != 0) {
            System.out.println(String.format("R1 = %.5f", x1));
            System.out.println(String.format("R2 = %.5f", x2));
        } else {
            System.out.println("Impossivel calcular");
        }

    }
}
