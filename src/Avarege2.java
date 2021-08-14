package src;
import java.util.Scanner;

public class Avarege2 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        double A = read.nextDouble();
        double B = read.nextDouble();
        double C = read.nextDouble();
        double MEDIA = ((A * 2) + (B * 3) + (C * 5))  / 10;
        System.out.println(String.format("MEDIA = %.1f", MEDIA));

        read.close();
    }
}
