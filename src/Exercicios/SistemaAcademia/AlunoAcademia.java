package Exercicios.SistemaAcademia;

public class AlunoAcademia {
    public String nome;
    public double peso;
    public double altura;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | Peso: " + peso + " | Altura: " + altura;
    }

    public void calcImc(){
        double calculo = peso/(altura*altura);
        System.out.printf(toString() + " | IMC: %.2f\n", calculo);
    }
}
