package br.com.mdantas.streams.operacoes.terminais;

import br.com.mdantas.streams.Pessoa;

import java.util.List;

/**
 * @author marcelo.dantas
 */
public class ExemplosAllMatch {

    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().populaPessoas();

        boolean result = lista.stream()
                .allMatch(pessoa -> pessoa.getNacionalidade().equals("Mexico"));

        System.out.println(result);
    }
}
