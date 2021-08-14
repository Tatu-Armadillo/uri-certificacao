package src;
import java.util.Scanner;

public class TimeConversion {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int time = read.nextInt();
        read.close();

        int hours = time / 3600;
        time = time % 3600;
        int minutes = time / 60;
        time = time % 60;
        int seconds = time;

        System.out.println(hours + ":" + minutes + ":" + seconds);

    }
}
