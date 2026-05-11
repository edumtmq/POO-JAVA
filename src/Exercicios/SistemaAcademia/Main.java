package Exercicios.SistemaAcademia;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        CADASTRO
        Scanner sc = new Scanner(System.in);
        int menu = 0;
        ArrayList<AlunoAcademia> alunos = new ArrayList<>();
        while (menu != 6){
            System.out.println("""
                    Menu:
                        1 - Cadastrar aluno
                        2 - Listar alunos
                        3 - Excluir aluno
                        4 - Buscar aluno
                        5 - Calcular IMC
                        6 - Sair
                    """);
            menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
                    AlunoAcademia aluno = new AlunoAcademia();
                    System.out.println("TELA DE CADASTRO");
                    System.out.println("Nome do aluno: ");
                    aluno.setNome(sc.nextLine());
                    System.out.println("Peso(kg) do aluno: ");
                    aluno.setPeso(sc.nextDouble());
                    sc.nextLine();
                    System.out.println("Altura do aluno (em metros) : ");
                    aluno.setAltura(sc.nextDouble());
                    alunos.add(aluno);
                    break;
                case 2: // LISTAGEM
                    System.out.println("---------------------");
                    System.out.println("RELATORIO DE ALUNOS");
                    for (AlunoAcademia a : alunos) {
                        System.out.println(a.toString());
                    }
                    break;
                case 3: // REMOVER ALUNOS
                    System.out.println("---------------------");
                    System.out.println("EXCLUSAO DE ALUNO");
                    for (AlunoAcademia a1 : alunos) {
                        System.out.println("Digite o nome do aluno que deseja remover: ");
                        String nome = sc.nextLine();
                        if (nome.equals(a1.nome)) {
                            alunos.remove(a1);
                            System.out.println("Aluno removido com sucesso!");
                        }
                        break;
                    }
                    break;
                case 4: // BUSCAR ALUNOS
                    System.out.println("---------------------");
                    System.out.println("PESQUISA RAPIDA");
                    for (AlunoAcademia a : alunos) {
                        System.out.println("Digite o nome do aluno que você procura: ");
                        String nome = sc.nextLine();
                        if (nome.equals(a.nome)) {
                            System.out.println(a.toString());
                        } else {
                            System.out.println("Aluno nao encontrado!");
                        } break;
                    }
                    break;
                case 5: // CALCULO IMC
                    System.out.println("---------------------");
                    System.out.println("CALCULO IMC");
                    int opcao = 0;
                    for (AlunoAcademia a : alunos) {
                        System.out.println("""
                                Digite 0 se deseja mostrar o IMC de todos os alunos
                                Digite 1 se deseja mostrar apenas de um aluno""");
                        opcao = sc.nextInt();
                        sc.nextLine();
                        for (AlunoAcademia a2 : alunos) {
                            if (opcao == 0) {
                                a2.calcImc();
                            } else if (opcao == 1) {
                                System.out.println("Digite o nome do aluno que você procura: ");
                                String nome = sc.nextLine();
                                if (nome.equals(a2.nome)) {
                                    a2.calcImc();
                                }
                            } else System.out.println("Opção invalida!");
                        } break;
                    } break;
            }
        }
        System.out.println("Sistema Finalizado!");
        sc.close();
    }
}
