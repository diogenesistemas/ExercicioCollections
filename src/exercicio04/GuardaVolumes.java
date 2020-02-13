package exercicio04;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaVolumes {
    private Map<Integer, List<Peca>> dicionario = new HashMap<>();
    private Integer contador = 0;

    public Integer guardarPecas(List<Peca> listaDePeca){
        this.dicionario.put(++this.contador, listaDePeca);
        return this.contador;
    }
    public void mostrarPecas(){
        for (Integer identificador : this.dicionario.keySet()){
            List<Peca> pecas = this.dicionario.get(identificador);
            System.out.println("========= Identificação: "+identificador+" =========");

            for (Peca peca : pecas) {
                System.out.println("---------Descrição da Peça---------");

                System.out.println("Marca: "+peca.getMarca());
                System.out.println("Modelo: "+peca.getModelo());
            }

        }

    }

    public void mostrarPecas(Integer numero){
        List<Peca> lista = this.dicionario.get(numero);
        System.out.println("========= Identificação: "+numero+" =========");
        for (Peca peca : lista) {
            System.out.println("---------Descrição da Peça---------");
            System.out.println("Marca: "+peca.getMarca());
            System.out.println("Modelo: "+peca.getModelo());
        }

    }

    public void devolverPecas(Integer numero){
        this.dicionario.remove(numero);
    }


}
