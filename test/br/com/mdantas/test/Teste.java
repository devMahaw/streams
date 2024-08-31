package br.com.mdantas.test;

import br.com.mdantas.streams.Exercicio;
import br.com.mdantas.streams.Pessoa;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author marcelo.dantas
 */
public class Teste {

    @Test
    public void testFiltrarPessoasPorSexoFeminino() {
        Exercicio exercicio = new Exercicio();
        List<Pessoa> lista = new Pessoa().populaPessoas();

        List<Pessoa> listaFeminino = exercicio.filtrarPessoasPorSexoFeminino(lista);

        assertTrue(listaFeminino.stream()
                .allMatch(pessoa -> pessoa.getSexo().equals("Feminino")));
    }
}