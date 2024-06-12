package br.com.mdantas.streams.operacoes.terminais;

import br.com.mdantas.streams.Pessoa;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * @author marcelo.dantas
 */
public class ExemplosOptional {

    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().populaPessoas();

        Optional<Pessoa> opcional = lista.stream()
                .max(Comparator.comparing(Pessoa::getIdade));

        if (opcional.isPresent()) {
            System.out.println(opcional.get());
        }

        opcional.ifPresent(System.out::println);
    }
}
