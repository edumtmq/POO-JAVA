package Exercicios.SistemaDeAlunos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<>();

        int opcao = 0;
        while(opcao != 5){
            System.out.println("""
                    Menu:
                            1 - Cadastrar aluno
                            2 - Listar alunos
                            3 - Remover aluno pelo nome
                            4 - Buscar aluno
                            5 - Sair""");
            opcao = sc.nextInt();
            sc.nextLine();

//            1- CADASTRO
            if(opcao == 1){
                Aluno aluno = new Aluno();
                System.out.println("Digite o nome do aluno: ");
                aluno.setNome(sc.nextLine());
                System.out.println("Digite a idade: ");
                aluno.setIdade(sc.nextInt());
                sc.nextLine();
                System.out.println("Digite a matricula: ");
                aluno.setMatricula(sc.nextLine());
//                adicionando na lista/ banco de dados

                alunos.add(aluno);
                System.out.println("Aluno Cadastrado!");
            }
//            2- LISTAR ALUNOS
            else if(opcao == 2){
                for(Aluno a: alunos){
                    System.out.println(a.toString());
                }
            }
//            3- REMOVER ALUNO PELO NOME
            else if(opcao == 3){
                System.out.println("Digite o nome do aluno que deseja remover: ");
                String nome =  sc.nextLine();
                for(Aluno a: alunos){
                    if(a.getNome().equals(nome)){
                        alunos.remove(a);
                        System.out.println("Aluno Removido!");
                        break;
                    }
                }
            }
//            4 - BUSCANDO O ALUNO
            else if(opcao == 4){
                System.out.println("Digite o nome do aluno que deseja buscar: ");
                String nome =  sc.nextLine();
                for(Aluno a: alunos){
                    if(a.getNome().equals(nome)){
                        System.out.println(a.toString());
                    }
                }
            }

        }
        sc.close();
    }
}
