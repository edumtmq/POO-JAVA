package Exercicios.SistemaDePedidos;

public class Pedido {
    private String cliente;
    private double valor;

    public Pedido(String cliente, double valor) {
        this.cliente = cliente;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Nome: " + cliente + " | Valor: R$" + valor;
    }
}
