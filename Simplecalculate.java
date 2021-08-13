import java.util.Scanner;

public class Simplecalculate {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String valoresProduto1 = read.nextLine();
        String array1[] = valoresProduto1.split(" ");
        // String codigo1 = array1[0];
        int numeroUnidade1 = Integer.parseInt(array1[1]);
        double precoUnidade1 = Double.parseDouble(array1[2]);

        String valoresProduto2 = read.nextLine();
        String array2[] = valoresProduto2.split(" ");
        // String codigo2 = array2[0];
        int numeroUnidade2 = Integer.parseInt(array2[1]);
        double precoUnidade2 = Double.parseDouble(array2[2]);

        double valorPagar = (numeroUnidade1 * precoUnidade1) + (numeroUnidade2 * precoUnidade2);

        read.close();
        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", valorPagar));
    }

}
