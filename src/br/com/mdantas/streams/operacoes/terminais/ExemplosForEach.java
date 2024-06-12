package br.com.mdantas.streams.operacoes.terminais;

import br.com.mdantas.streams.Pessoa;

import java.util.List;

/**
 * @author marcelo.dantas
 */
public class ExemplosForEach {

    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().populaPessoas();

        lista.stream()
                .forEach(pessoa -> System.out.println(pessoa.getNome()));

        lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Mexico"))
                .forEach(pessoa -> System.out.println(pessoa.getNome()));

        lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .mapToInt(Pessoa::getIdade)
                .forEach(System.out::println);
    }
}
