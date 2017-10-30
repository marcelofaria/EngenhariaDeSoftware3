package model;

import java.util.*;

/**
 * 
 */
public class Gerente extends Funcionario {
    
    private String cnpj;
    private int idGerente;
    
    public Gerente(String senha, String nome, String cpf, String cnpj) {
        super(senha, nome, cpf);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getIdGerente() {
        return idGerente;
    }

    public void setIdGerente(int idGerente) {
        this.idGerente = idGerente;
    }

}