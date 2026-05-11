package Exercicios.SistemaDeAlunos;

public class Aluno {
//    ATRIBUTOS
    public String nome;
    public int idade;
    public String matricula;
//      GETTERS E SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public String getMatricula() {
        return matricula;
    }
//    TOSTRING
    public String toString(){
        return "Nome: " + nome + "| Idade: " + idade + "| Matricula: " + matricula;
    }
}
