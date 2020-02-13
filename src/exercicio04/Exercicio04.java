package exercicio04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercicio04 {
    public static void main(String[] args) {
        Peca peca1 = new Peca("Marvel", "Chaveiro");
        Peca peca2 = new Peca("Motorola", "Celular");

        List<Peca> lista1 = Arrays.asList(peca1, peca2);

        GuardaVolumes guardaVolume = new GuardaVolumes();

        guardaVolume.guardarPecas(lista1);
//        guardaVolume.mostrarPecas();

        guardaVolume.mostrarPecas(2);

    }
}
