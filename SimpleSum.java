import java.util.Scanner;

public class SimpleSum {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int A = ler.nextInt();
        int B = ler.nextInt();
        ler.close();

        int SOMA = A + B;
        System.out.println("SOMA = " + SOMA);
    }
}
