package Exercicios.SistemaDeBiblioteca;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        1 - cadastrar livro
        2 - listar livros
        3 - emprestar livro
        4 - devolver livro
         */

        ArrayList<Livro> livros = new ArrayList<Livro>();
        Livro livro1 = new Livro("A hora da estrela", "Clarice Lispector", 10);
        Livro livro2 = new Livro("A noite estrelada", "Van Gogh", 8);
        Livro livro3 = new Livro("Revolta dos bichos", "George Orwell", 20);

        livros.add(livro1);
        livros.add(livro2);
        livros.add(livro3);
        livro1.emprestar(4);
        for(Livro livro: livros){
            System.out.println(livro.toString());
        }
        livro1.devolver(3);
        for(Livro livro: livros){
            System.out.println(livro.toString());
        }











    }
}
