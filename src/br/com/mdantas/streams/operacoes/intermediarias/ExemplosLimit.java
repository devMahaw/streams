package br.com.mdantas.streams.operacoes.intermediarias;

import br.com.mdantas.streams.Pessoa;

import java.util.List;

/**
 * @author marcelo.dantas
 */
public class ExemplosLimit {

    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().populaPessoas();

        lista.stream()
                .limit(2)
                .forEach(System.out::println);
    }
}
