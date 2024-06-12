package br.com.mdantas.streams;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

/**
 * @author marcelo.dantas
 */
public class CriandoStreams {

    public static void main(String[] args) {
        Stream<String> stream = List.of("Marcelo", "Dantas", "Araújo").stream();

        Stream<String> stream1 = Set.of("Marcelo", "Dantas", "Araújo").stream();

        Map<String, String> map = Map.of("Marcelo", "Dantas");
        Stream<String> chaves = map.keySet().stream();
        Stream<String> values = map.values().stream();

        Stream<String> streamDireto = Stream.of("String", "asas");
    }
}
