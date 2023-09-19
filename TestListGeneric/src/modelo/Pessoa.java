// Pacote modelo
package modelo;

// Classe Pessoa que implementa a interface IExibirInformacoes

import generic.IExibirInformacoes;

public class Pessoa implements IExibirInformacoes {
    private int id;
    private String nome;
    private int idade;

    // Construtor
    public Pessoa(int id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    // Métodos getters e setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Implementação do método da interface para exibir informações
    @Override
    public void exibirInformacoes() {
        System.out.println( "ID: " + id + "\nNome: " + nome + "\nIdade: " + idade);
    }
}

