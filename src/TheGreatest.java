package src;
import java.util.Scanner;

public class TheGreatest {

    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        String in = read.nextLine();
        String out[] = in.split(" ");

        int a = Integer.parseInt(out[0]);
        int c = Integer.parseInt(out[1]);
        int b = Integer.parseInt(out[2]);
        int maiorAB = (a + b +  Math.abs(a - b)) / 2;
        maiorAB = (c + maiorAB +  Math.abs(maiorAB - c)) / 2;
        
        read.close();
        System.out.println(maiorAB + " eh o maior");
        
    }
}
