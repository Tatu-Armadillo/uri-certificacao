package src;
import java.util.Scanner;

public class FuelSpent {
    
    public static void main(String[] args) {
        
        Scanner read =  new Scanner(System.in);
        double time = read.nextDouble(); 
        double speed = read.nextDouble();
        double distance = (time * speed) / 12;

        read.close();
        System.out.println(String.format("%.3f", distance));
    }
}
