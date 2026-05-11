package Exercicios.SistemaDeBanco;

public class Conta {
    private String titular;
    private double saldo;

    public Conta(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }
    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
    public double saldoTotal(){
        return saldo;
    }
    public void depositar(double valor) {
        this.saldo += valor;
        double v = saldoTotal();
        System.out.println("Deposito realizado com sucesso!");
        System.out.println("Saldo atual: R$" + v);
    }

    public void sacar(double valor){
        if(saldo >= valor){
            this.saldo -= valor;
        System.out.println("Saque realizado!");
        }else{
            System.out.println("Saldo insuficiente");
        }
        double v = saldoTotal();
        System.out.println("Saldo atual: R$" + v);
    }

}
