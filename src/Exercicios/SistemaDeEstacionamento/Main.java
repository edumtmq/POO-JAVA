package Exercicios.SistemaDeEstacionamento;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        ArrayList<Manobravel> veiculos = new ArrayList<>();
        Manobravel c1 = new Carro("Onix", "PSO759");
        Manobravel c2 = new Carro("Civic", "EDL459");
        Manobravel m1 = new Moto("Fazer 15", "EIO559");
        Manobravel m2 = new Moto("Fazer 25", "EIO559");

        veiculos.add(c1);
        veiculos.add(c2);
        veiculos.add(m1);
        veiculos.add(m2);

        for(Manobravel v: veiculos){
            System.out.println(v.toString());
        }

        c1.sair();
        m2.sair();
        veiculos.remove(c1);
        veiculos.remove(m2);

    }
}
