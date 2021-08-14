package src;
import java.util.Scanner;

public class AgeInDays {
    
    public static void main(String[] args) {
        
        Scanner read  = new Scanner(System.in);
        int days = read.nextInt();
        read.close();
        
        int years =  days / 365;
        days = days % 365;
        int month = days / 30;
        days = days % 30;

        System.out.println(years + " ano(s)");
        System.out.println(month + " mes(es)");
        System.out.println(days + " dia(s)");

    }
}
