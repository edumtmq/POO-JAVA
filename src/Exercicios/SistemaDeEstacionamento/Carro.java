package Exercicios.SistemaDeEstacionamento;

public class Carro extends Veiculo implements Manobravel {
    public Carro(String modelo, String placa) {
        super(modelo, placa);
    }

    @Override
    public void estacionar() {
        if(vagas >= 1){
            System.out.println("Carro estacionando: " + toString());
            System.out.println("Carro estacionado!");
            vagas --;
        }
    }

    @Override
    public void sair() {
        System.out.println("Carro saindo: " + toString());
        System.out.println("Vaga liberada! ");
        vagas ++;
    }

}
