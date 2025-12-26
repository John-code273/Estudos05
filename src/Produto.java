import java.util.Set;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double totalValor(){
        return quantidade * preco;
    }
    public void adicionar(int quantidade){
        this.quantidade += quantidade;
    }
    public void remover(int quantidade){
        this.quantidade -= quantidade;
    }

    @Override
    public String toString() {
        return nome + ", $"
                +String.format("%.2f", preco)
                +", "+quantidade+" unidades, total : "+
                String.format("%.2f", totalValor());
    }
}
