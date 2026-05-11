package Exercicios.SistemaDeBanco;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta("Eduardo", 1000.50);
        conta.sacar(1200);
        conta.depositar(200);
        conta.sacar(1200);
    }
}
