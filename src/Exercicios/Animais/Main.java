package Exercicios.Animais;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList<Animal>();
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();
        Animal vaca = new Vaca();
        animais.add(cachorro);
        animais.add(gato);
        animais.add(vaca);
        for(Animal animal : animais){
            animal.emitirSom();
        }
    }
}
