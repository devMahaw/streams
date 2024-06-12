package br.com.mdantas.streams.operacoes.intermediarias;

import br.com.mdantas.streams.Pessoa;

import java.util.List;

/**
 * @author marcelo.dantas
 */
public class ExemplosMap {
    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().populaPessoas();

        lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .map(Pessoa::getIdade)
                .forEach(System.out::println);

        lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .mapToInt(Pessoa::getIdade)
                .forEach(System.out::println);
    }
}
