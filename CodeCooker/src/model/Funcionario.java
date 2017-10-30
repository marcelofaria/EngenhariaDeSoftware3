package model;

import java.util.*;

/**
 * 
 */
public abstract class Funcionario {

    private String nome;
    private String cpf;
    private String senha;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
        
    public Funcionario(String senha, String nome, String cpf) {
        this.senha = senha;
        this.nome = nome;
        this.cpf = cpf;
    }



}