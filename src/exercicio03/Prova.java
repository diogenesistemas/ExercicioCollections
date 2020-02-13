package exercicio03;

import java.util.Set;

public class Prova {

    public void somaTotal(Set<Integer> conjuntoDeInteiros){
        Integer soma = 0;
        for (Integer valor : conjuntoDeInteiros) {
            soma+=valor;
        }
        System.out.println("A soma total dos ítens é: "+soma);
    }
}
