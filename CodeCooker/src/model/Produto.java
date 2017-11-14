package model;
import java.util.*;

/**
 * 
 */
public class Produto {

    private int id;
    private int qtd;
    private String nome;
    private String marca;
    private String fornecedor;
    /**
     * Default constructor
     */
    public Produto(int qtd, String nome, String marca, String fornecedor) {
        
        this.setQtd(qtd);
        this.setNome(nome);
        this.setMarca(marca);
        this.setFornecedor(fornecedor);
 
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }



}