package beginner;
import java.util.Scanner;

public class Banknotes {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int valor = read.nextInt();
        int notas = 0;
        read.close();

        notas = valor / 100;
        valor = valor % 100;
        System.out.println(notas + " nota(s) de R$ 100,00");

        notas = valor / 50;
        valor = valor % 50;
        System.out.println(notas + " nota(s) de R$ 50,00");

        notas = valor / 20;
        valor = valor % 20;
        System.out.println(notas + " nota(s) de R$ 20,00");

        notas = valor / 10;
        valor = valor % 10;
        System.out.println(notas + " nota(s) de R$ 10,00");

        notas = valor / 5;
        valor = valor % 5;
        System.out.println(notas + " nota(s) de R$ 5,00");

        notas = valor / 2;
        valor = valor % 2;
        System.out.println(notas + " nota(s) de R$ 2,00");

        notas = valor / 1;
        valor = valor % 1;
        System.out.println(notas + " nota(s) de R$ 1,00");
    }
}
