package br.com.mdantas.streams;

import java.util.List;
import java.util.Objects;

/**
 * @author marcelo.dantas
 */
public class Pessoa {

    private String id;

    private String nome;

    private String nacionalidade;

    private String sexo;

    private int idade;

    public Pessoa() {

    }

    public Pessoa(String id, String nome, String nacionalidade, String sexo, int idade) {
        this.id = id;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public List<Pessoa> populaPessoas() {
        Pessoa pessoa1 = new Pessoa("p1", "Matheus Henrique", "Brasil", "Masculino",18);
        Pessoa pessoa2 = new Pessoa("p2", "Hernandez Roja", "Mexico", "Masculino",21);
        Pessoa pessoa3 = new Pessoa("p3", "Maria Fernandes", "Canada", "Feminino",22);
        Pessoa pessoa4 = new Pessoa("p4", "Neymar Junior", "Brasil", "Masculino",33);
        Pessoa pessoa5 = new Pessoa("p4", "Neymar Junior", "Brasil", "Masculino",37);
        Pessoa pessoa6 = new Pessoa("p5", "Julia Roberta", "Brasil", "Feminino",57);
        return List.of(pessoa1, pessoa2, pessoa3, pessoa4, pessoa5, pessoa6);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(id, pessoa.id) && Objects.equals(nome, pessoa.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

    public String toString() {
        return "Pessoa:" + '\'' +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", sexo='" + sexo + '\'' +
                ", idade=" + idade;
    }
}
