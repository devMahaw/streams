package br.com.mdantas.streams.operacoes.terminais;

import br.com.mdantas.streams.Pessoa;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author marcelo.dantas
 */
public class ExemplosCollect {

    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().populaPessoas();

        lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
