package Exercicios.Funcionarios;

public class Funcionario {
    public String nome;
    public double salario = 2000;
    public double bonus;

    public Funcionario(String nome, double bonus) {
        this.nome = nome;
        this.bonus = bonus;
    }

    public double getSalario() {
        double porcentagem = this.bonus / 100;
        return salario * porcentagem;
    }


}
