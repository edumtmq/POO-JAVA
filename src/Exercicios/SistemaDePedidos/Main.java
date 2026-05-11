package Exercicios.SistemaDePedidos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Pedido> pedidos = new ArrayList<>();

        Pedido p1 = new Pedido("Eduardo", 600);
        Pedido p2 = new Pedido("Ismael", 10);
        Pedido p3 = new Pedido("Rony", 1500);
        Pedido p4 = new Pedido("Bruno", 30);

        pedidos.add(p1);
        pedidos.add(p2);
        pedidos.add(p3);
        pedidos.add(p4);

        for(Pedido pedido: pedidos){
            System.out.println(pedido.toString());
        }

        double total = 0;
        for(Pedido pedido: pedidos){
            total += pedido.getValor();
        }
        System.out.println("Total: R$" + total);





    }
}
