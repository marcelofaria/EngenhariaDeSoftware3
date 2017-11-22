package model;

import java.util.*;


public class Item {

    /**
     * Default constructor
     * @param itemID
     */
    public Item(int itemID, String nome, String tipo, float preco, String ingredientes, boolean disp) {
        this.itemID = itemID;
        this.nome = nome;
        this.tipo = tipo;
        this.preco = preco;
        this.ingredientes = ingredientes;
        this.disponibilidade = disp;
    }
    
    private int itemID;

    public int getId() {
        return itemID;
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
    

    private String tipo;

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

    public boolean getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}