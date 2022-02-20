package certificacao.udemy;

public class Produto {
    
    final public String nome;
    final public Double preco;
    final public Double frete;
    final public Double desconto;

    public Produto(String nome, Double preco, Double frete, Double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.frete = frete;
        this.desconto = desconto;
    }

}
