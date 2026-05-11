package Exercicios.Funcionarios;

public class Gerente extends Funcionario{
    public Gerente(String nome, double bonus) {
        super(nome, bonus);
    }

    @Override
    public String toString() {
        return " Gerente: " + nome + " | Bonus: R$" + getSalario();
    }
}
