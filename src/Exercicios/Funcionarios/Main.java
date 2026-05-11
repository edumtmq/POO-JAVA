package Exercicios.Funcionarios;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
        criar lista de funcionario
        calculaer bonus de cada um
         */
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        Funcionario f = new Gerente("Eduardo", 20);
        Funcionario f2 = new Vendedor("Gustavo", 10);
        funcionarios.add(f);
        funcionarios.add(f2);
        for( Funcionario funcionario : funcionarios){
            System.out.println(funcionario.toString());
        }
    }
}
