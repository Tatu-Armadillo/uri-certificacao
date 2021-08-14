package beginner;
import java.util.Scanner;

public class Distance {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int distance = read.nextInt();
        double carX = 60.0;
        double carY = 90.0;
        double auxiliar = distance / (carY - carX);
        double time = ( auxiliar * 60);

        read.close();
        System.out.println(String.format("%.0f minutos", time));

    }
}
