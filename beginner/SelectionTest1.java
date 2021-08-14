package beginner;
import java.util.Scanner;

public class SelectionTest1 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        String in = read.nextLine();
        String out[] = in.split(" ");
        read.close();

        int A = Integer.parseInt(out[0]);
        int B = Integer.parseInt(out[1]);
        int C = Integer.parseInt(out[2]);
        int D = Integer.parseInt(out[3]);

        if (B > C && D > A && (C + D) > (A + B) && C > 0 && D > 0 && A % 2 == 0) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
    }
}
