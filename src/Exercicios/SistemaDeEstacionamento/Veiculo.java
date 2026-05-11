package Exercicios.SistemaDeEstacionamento;

public class Veiculo {

    public String modelo;
    public String placa;
    public int vagas = 5;

    public Veiculo(String modelo, String placa) {
        this.modelo = modelo;
        this.placa = placa;
    }
    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public int getVagas() {
        return vagas;
    }

    @Override
    public String toString() {
        return "Veiculo: " + modelo + " | Placa: " + placa ;
    }

}
