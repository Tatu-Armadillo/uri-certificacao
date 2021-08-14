package src;
import java.util.Scanner;

public class Area {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        String input = read.nextLine();
        String output[] = input.split(" ");

        double pi = 3.14159;
        double A = Double.parseDouble(output[0]);
        double B = Double.parseDouble(output[1]);
        double C = Double.parseDouble(output[2]);

        double triangulo = (A * C) / 2;
        double circulo = C * C * pi;
        double trapezio = ((B + A) * C) / 2;
        double quadrado = B * B;
        double retangulo = A * B;

        read.close();
        System.out.println(String.format("TRIANGULO: %.3f", triangulo));
        System.out.println(String.format("CIRCULO: %.3f", circulo));
        System.out.println(String.format("TRAPEZIO: %.3f", trapezio));
        System.out.println(String.format("QUADRADO: %.3f", quadrado));
        System.out.println(String.format("RETANGULO: %.3f", retangulo));

    }
}
