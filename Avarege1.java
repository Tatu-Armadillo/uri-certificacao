import java.util.Scanner;

public class Avarege1 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double A = read.nextDouble();
        double B = read.nextDouble();
        double MEDIA = ((A * 3.5) + (B * 7.5)) / 11;
        System.out.println(String.format("MEDIA = %.5f", MEDIA));

        read.close();
    }
}
