package Exercicios.SistemaDeProdutos;

public class Produto {
//    ATRIBUTOS
    public String nome;
    public double preco;
    public int quantidade;

//    SETTERS E GETTERS

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
//    TOSTRING
    @Override
    public String toString() {
        return "Produto : " + nome + " | Total: " + quantidade;
    }
}
