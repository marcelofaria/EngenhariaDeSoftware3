package model;

import java.util.*;

/**
 * 
 */

enum Tipo{
    Prato, Bebida, Sobremesa, Porcao
}

public class Item {

    /**
     * Default constructor
     */
    public Item() {
    }

    /**
     * 
     */
    private String nome;

    /**
     * 
     */
    private float preco;

    /**
     * 
     */
    private String ingredientes;

    /**
     * 
     */
    private boolean disponibilidade;
    

    private Tipo tipo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

}