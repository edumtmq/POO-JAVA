package Exercicios.SistemaDeCarros;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return marca + " " + modelo + " " + ano;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public void buscarModelo(String modelo){
        if (modelo.equals(this.modelo)){
            System.out.println("Modelo encontrado: " + toString());
        }
    }
    public void filtroAno(int ano){
        if (this.ano > ano){
            System.out.println(toString());
        }
    }
}
