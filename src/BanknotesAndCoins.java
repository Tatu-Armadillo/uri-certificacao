package src;
import java.util.Scanner;

public class BanknotesAndCoins {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        Double valor = read.nextDouble();
        Double banknotes = 0.0;
        Double coins = 0.0;
        read.close();

        System.out.println("NOTAS:");
        banknotes = valor / 100;
        valor = valor % 100;
        System.out.println(String.format("%d nota(s) de R$ 100.00", banknotes.intValue()));

        banknotes = valor / 50;
        valor = valor % 50;
        System.out.println(String.format("%d nota(s) de R$ 50.00", banknotes.intValue()));

        banknotes = valor / 20;
        valor = valor % 20;
        System.out.println(String.format("%d nota(s) de R$ 20.00", banknotes.intValue()));

        banknotes = valor / 10;
        valor = valor % 10;
        System.out.println(String.format("%d nota(s) de R$ 10.00", banknotes.intValue()));

        banknotes = valor / 5;
        valor = valor % 5;
        System.out.println(String.format("%d nota(s) de R$ 5.00", banknotes.intValue()));

        banknotes = valor / 2;
        valor = valor % 2;
        System.out.println(String.format("%d nota(s) de R$ 2.00", banknotes.intValue()));

        System.out.println("MOEDAS:");
        coins = banknotes;

        coins = valor / 1.0;
        valor = valor % 1.0;
        System.out.println(String.format("%d moeda(s) de R$ 1.00", coins.intValue()));

        coins = valor / 0.5;
        valor = valor % 0.5;
        System.out.println(String.format("%d moeda(s) de R$ 0.50", coins.intValue()));

        coins = valor / 0.25;
        valor = valor % 0.25;
        System.out.println(String.format("%d moeda(s) de R$ 0.25", coins.intValue()));

        coins = valor / 0.10;
        valor = valor % 0.10;
        System.out.println(String.format("%d moeda(s) de R$ 0.10", coins.intValue()));

        coins = valor / 0.05;
        valor = valor % 0.05;
        System.out.println(String.format("%d moeda(s) de R$ 0.05", coins.intValue()));

        coins = valor / 0.01;
        valor = valor % 0.01;
        System.out.println(String.format("%d moeda(s) de R$ 0.01", coins.intValue()));

    }
}
