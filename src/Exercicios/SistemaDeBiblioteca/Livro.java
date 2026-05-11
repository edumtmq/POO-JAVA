package Exercicios.SistemaDeBiblioteca;

public class Livro {
    public String nome;
    public String autor;
    public boolean disponivel = true;
    public int exemplares;
    public int exemplaresTotais;

//    CONSTRUTOR
    public Livro(String nome, String autor, int exemplares){
        this.nome = nome;
        this.autor = autor;
        this.exemplares = exemplares;
        this.exemplaresTotais = exemplares;
    }

//    emprestar
    public void emprestar(int quantidade){
        if(disponivel){
            if(quantidade < exemplares) {
                exemplares -= quantidade;
                System.out.println("Emprestado com sucesso!");
            }
            else if(quantidade > exemplares){
                System.out.println("Quantidade de exemplares indisponivel");
            }
        }
    }
//    devolver
    public void devolver(int quantidade){
        if( quantidade <=0 ){
            System.out.println("Impossivel devolver 0 unidades");
        }

        if (exemplares + quantidade <= exemplaresTotais){
            exemplares += quantidade;
            System.out.println("Livro devolvido com sucesso!");
        } else {
            System.out.println("Nao é possivel devolver essa quantidade");
        }
    }
    @Override
    public String toString() {
        return "Titulo: " + nome + " | Autor: " + autor +  " | Exemplares: " + exemplares;
    }
}
