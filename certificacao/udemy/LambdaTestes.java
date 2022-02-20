package certificacao.udemy;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaTestes {
    public static void main(String[] args) {

        Produto p1 = new Produto("Celular", 10.00, 1.0, 0.10);
        Produto p2 = new Produto("Livro", 5.00, 0.0, 0.10);
        Produto p3 = new Produto("PC", 200.00, 1.0, 0.80);
        Produto p4 = new Produto("Notbook", 100.00, 0.0, 0.50);
        Produto p5 = new Produto("PS5", 500.00, 2.0, 0.50);
        Produto p6 = new Produto("Xbox", 500.00, 0.0, 0.70);
        Produto p7 = new Produto("Nintendo", 500.00, 2.0, 0.60);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7);

        Predicate<Produto> destaque = p -> ((p.frete == 0.0) && (p.desconto >= 0.30));
        Function<Produto, String> produtoDestaque = p -> "| " + p.nome + " | " + (p.preco - (p.preco * p.desconto)) + " | ";

        produtos.stream()
                .filter(destaque)
                .map(produtoDestaque)
                .forEach(System.out::print);

    }
}
