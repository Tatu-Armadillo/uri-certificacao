package src;
import java.util.Scanner;

public class Salary {
    
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);

        int employeeNumber = read.nextInt();
        int hours = read.nextInt();
        double received = read.nextDouble();
        double value = hours * received;

        read.close();
        System.out.println("NUMBER = " + employeeNumber);
        System.out.println(String.format("SALARY = U$ %.2f", value));
    }
}
