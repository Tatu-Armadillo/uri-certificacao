package src;
import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) throws Exception {

        Scanner ler = new Scanner(System.in);
        
        int A, B;
        System.out.print("Digite o valor de A: ");
        A = ler.nextInt();
        System.out.print("Digite o valor de B: ");
        B = ler.nextInt();
        ler.close();

        int X = A + B;
        System.out.println("X = " + X);

    }
}
