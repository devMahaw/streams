package br.com.mdantas.streams.operacoes.intermediarias;

import br.com.mdantas.streams.Pessoa;

import java.util.Comparator;
import java.util.List;

/**
 * @author marcelo.dantas
 */
public class ExemplosSort {

    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().populaPessoas();

        lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .sorted(Comparator.comparing(Pessoa::getNome))
                .forEach(pessoa -> System.out.println(pessoa.getNome()));

        lista.stream()
                .sorted(Comparator.comparing(Pessoa::getIdade))
                .forEach(pessoa -> System.out.println(pessoa.getIdade()));

        lista.stream()
                .sorted((p1, p2) -> Integer.compare(p2.getIdade(), p1.getIdade()))
                .forEach(pessoa -> System.out.println(pessoa.getIdade()));
    }
}
