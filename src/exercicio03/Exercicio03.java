package exercicio03;

import java.util.HashSet;
import java.util.Set;

public class Exercicio03 {
    public static void main(String[] args) {
        Prova prova = new Prova();
        Set<Integer> valores = new HashSet<>();
        valores.add(2);
        valores.add(1);
        valores.add(3);
        valores.add(4);
        prova.somaTotal(valores);
    }
}
