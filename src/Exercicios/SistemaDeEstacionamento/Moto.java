package Exercicios.SistemaDeEstacionamento;

public class Moto extends Veiculo implements Manobravel{
    public Moto(String modelo, String placa) {
        super(modelo, placa);
    }

    @Override
    public void estacionar() {
        System.out.println("Moto estacionando: " + toString());
        System.out.println("Moto estacionada!");
        vagas--;
    }

    @Override
    public void sair() {
        System.out.println("Moto saindo! " + toString());
        System.out.println("Vaga liberada!");
    }
}
