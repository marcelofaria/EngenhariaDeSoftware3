package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class Caixa extends Funcionario {

    private int ID;

    public int getID() {
        return ID;
    }
    
    private String nome;
    private String cpf;

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
    
    
    
    public Caixa(String nome, String cpf) {
        super(nome, cpf);
        
    }
    
}