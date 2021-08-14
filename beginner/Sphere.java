package beginner;
import java.util.Scanner;

public class Sphere {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        Long r = read.nextLong();
        double pi = 3.14159;
        double volume = (4 / 3.0) * pi * (r * r * r);

        read.close();
        System.out.println(String.format("VOLUME = %.3f", volume));
    }
}
