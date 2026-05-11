package Exercicios.SistemaDeProdutos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Cadastrar
        listar
        calc valor total estoque
         */
        Scanner sc = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<Produto>();

        int menu = 0;
        while(menu != 4){
            System.out.println("""
                   Menu:
                            1 - Cadastrar produto
                            2 - Listar produtos
                            3 - Calcular valor do estoque
                            4 - Sair
                   """);
            menu = sc.nextInt();
            sc.nextLine();

            if(menu == 1) {
                Produto produto = new Produto();
                System.out.println("Digite o nome do produto: ");
                produto.setNome(sc.next());
                System.out.println("Digite o quantidade do produto: ");
                produto.setQuantidade(sc.nextInt());
                sc.nextLine();
                System.out.println("Digite o valor do produto: ");
                produto.setPreco(sc.nextDouble());

                produtos.add(produto);
            }
            else if(menu == 2) {
                for(Produto produto : produtos) {
                    System.out.println(produto.toString());
                }
            }

            else if(menu == 3) {
                int somaEstoque = 0;
                for(Produto produto : produtos) {
                    int quantidade = produto.getQuantidade();
                    somaEstoque += quantidade;
                }
                System.out.println("O total do estoque: " + somaEstoque);
            }
        }
        sc.close();
    }
}
