package exercicio01;

import java.util.*;

public class Exercicio1 {



    public static void main(String[] args) {
        Map<Integer, String> loteriaDosSonhos = new HashMap<>();
        loteriaDosSonhos.put(0, "Ovos");
        loteriaDosSonhos.put(1, "Água");
        loteriaDosSonhos.put(2, "Escopeta");
        loteriaDosSonhos.put(3, "Cavalo");
        loteriaDosSonhos.put(4, "Dentista");
        loteriaDosSonhos.put(5, "Fogo");

        System.out.println("----------------------- Exercício 1 -------------------------");
        System.out.println("---------------Imprimindo a Loteria dos Sonhos---------------");
        for(Integer chave : loteriaDosSonhos.keySet()){
            System.out.println(chave + " -> " +loteriaDosSonhos.get(chave));
        }

        System.out.println("----------Imprimindo a lista de Aplelidos dos Amigos---------");
        Map<String, List<String>> listaDeApelidosDeAmigos = new HashMap<>();

        List<String> listaJoao = Arrays.asList("Juan","Fissura","Maromba");
//        listaJoao.add("Juan");
//        listaJoao.add("Fissura");
//        listaJoao.add("Maromba");
        listaDeApelidosDeAmigos.put("João", listaJoao);

        List<String> listaMiguel = Arrays.asList("Night Watch", "Bruce Wayne", "Tampinha");
//        listaMiguel.add("Night Watch");
//        listaMiguel.add("Bruce Wayne");
//        listaMiguel.add("Tampinha");
        listaDeApelidosDeAmigos.put("Miguel", listaMiguel);

        List<String> listaMaria = Arrays.asList("Wonder Woman", "Mary", "Marilene");
        listaDeApelidosDeAmigos.put("Maria",listaMaria);

        List<String> listaLucas = Arrays.asList("Lukinha", "Jorge", "George");
        listaDeApelidosDeAmigos.put("Lucas",listaLucas);

        for(String chave : listaDeApelidosDeAmigos.keySet()){
            List<String> apelidos = listaDeApelidosDeAmigos.get(chave);
            System.out.println("Apelidos dos amigos de  "+ chave+": "+ apelidos);
        }
    }
}
