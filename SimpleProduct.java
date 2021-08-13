import java.util.Scanner;

public class SimpleProduct {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int A = ler.nextInt();
        int B = ler.nextInt();
        ler.close();

        int PROD = A * B;
        System.out.println("PROD = " + PROD);
    }
}
