package Exercicios.Funcionarios;

public class Vendedor extends  Funcionario {
    public Vendedor(String nome, double bonus) {
        super(nome, bonus);
    }

    @Override
    public String toString() {
        return " Vendedor: " + nome + " | Bonus: R$" + getSalario();
    }
}
