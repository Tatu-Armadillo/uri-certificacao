import java.util.Scanner;

public class DistanceBetweenTwoPoints {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        String in1 = read.nextLine();
        String out1[] = in1.split(" ");
        double x1 = Double.parseDouble(out1[0]);
        double y1 = Double.parseDouble(out1[1]);

        String in2 = read.nextLine();
        String out2[] = in2.split(" ");
        double x2 = Double.parseDouble(out2[0]);
        double y2 = Double.parseDouble(out2[1]);

        double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

        read.close();
        System.out.println(String.format("%.4f", distance));
    }
}
