package beginner;
import java.util.Scanner;

public class CircleArea {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        double n = 3.14159;
        double R = read.nextDouble();
        System.out.print("Valor do Raio: ");
        double A = R * R * n;

        read.close();
        System.out.println(String.format("A=%.4f", A));

    }
}
