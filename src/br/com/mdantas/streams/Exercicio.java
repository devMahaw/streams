package br.com.mdantas.streams;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author marcelo.dantas
 */
public class Exercicio {

    public List<Pessoa> filtrarPessoasPorSexoFeminino(List<Pessoa> lista) {
        return lista.stream()
                .filter(pessoa -> pessoa.getSexo().equals("Feminino"))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().populaPessoas();
        Exercicio exercicio = new Exercicio();

        exercicio.filtrarPessoasPorSexoFeminino(lista)
                .forEach(System.out::println);
    }
}
