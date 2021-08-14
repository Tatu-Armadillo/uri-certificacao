package src;
import java.util.Scanner;

public class Consumption {
    
    public static void main(String[] args) {
        
        Scanner read =  new Scanner(System.in);
        
        int distance = read.nextInt();
        double fuel = read.nextDouble();
        double kml = distance/fuel;

        read.close();
        System.out.println(String.format("%.3f km/l", kml));
    }
}
