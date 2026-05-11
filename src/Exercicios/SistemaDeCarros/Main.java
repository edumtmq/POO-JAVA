package Exercicios.SistemaDeCarros;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        cadastrar carros
        listar
        buscar modelo
        listar apenas carro acima de certo ano
         */

//        cadastro
        ArrayList<Carro> carros = new ArrayList<Carro>();

        Carro c1 = new Carro("Wolks", "Saveiro", 2021);
        Carro c2 = new Carro("Benz", "Benz", 2018);
        Carro c3 = new Carro("JEEP", "Compass", 2025);
        Carro  c4 = new Carro("Wolks", "Fox", 2010);
        carros.add(c1);
        carros.add(c2);
        carros.add(c3);
        carros.add(c4);
//        listagem
        System.out.println("---------------------");
        System.out.println("Listagem:");
        for(Carro carro : carros){
            System.out.println(carro.toString());
        }

//        buscar modelo
        System.out.println("---------------------");
        System.out.println("Busca: ");
        for(Carro carro : carros){
            carro.buscarModelo("Saveiro");
        }
//        CARROS 2020++
        System.out.println("---------------------");
        System.out.println("Filtro: ");
        for(Carro carro : carros){
            carro.filtroAno(2020);
        }
    }
}
