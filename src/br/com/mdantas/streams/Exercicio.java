package br.com.mdantas.streams;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author marcelo.dantas
 */
public class Exercicio {

    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().populaPessoas();

        lista.stream()
                .filter(pessoa -> pessoa.getSexo().equals("Feminino"))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
