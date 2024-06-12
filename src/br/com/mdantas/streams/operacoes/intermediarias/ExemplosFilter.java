package br.com.mdantas.streams.operacoes.intermediarias;

import br.com.mdantas.streams.Pessoa;

import java.util.List;
import java.util.function.Predicate;

/**
 * @author marcelo.dantas
 */
public class ExemplosFilter {

    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().populaPessoas();

        lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .forEach(pessoa -> System.out.println(pessoa.getNome()));

        Predicate<Pessoa> pred = pessoa -> pessoa.getNacionalidade().equals("Brasil");
        lista.stream()
                .filter(pred)
                .forEach(pessoa -> System.out.println(pessoa.getNome()));

        Predicate<Pessoa> pred1 = new Predicate<Pessoa>() {
            @Override
            public boolean test(Pessoa pessoa) {
                return pessoa.getNacionalidade().equals("Brasil");
            }
        };
        lista.stream()
                .filter(pred1)
                .forEach(pessoa -> System.out.println(pessoa.getNome()));

        lista.stream().filter(new Predicate<Pessoa>() {
            @Override
            public boolean test(Pessoa pessoa) {
                return pessoa.getNacionalidade().equals("Brasil");
            }
        }).forEach(pessoa -> System.out.println(pessoa.getNome()));
    }
}
