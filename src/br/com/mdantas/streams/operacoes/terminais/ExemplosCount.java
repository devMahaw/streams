package br.com.mdantas.streams.operacoes.terminais;

import br.com.mdantas.streams.Pessoa;

import java.util.List;

/**
 * @author marcelo.dantas
 */
public class ExemplosCount {

    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().populaPessoas();

         long count = lista.stream()
                .filter(pessoa -> pessoa.getNome().startsWith("M"))
                .count();

        System.out.println(count);
    }
}
