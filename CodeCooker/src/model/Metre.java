package model;

import java.util.*;

/**
 * 
 */
public class Metre extends Funcionario {

    public Metre(String senha, String nome, String cpf) {
        super(senha, nome, cpf);
    }

    private int idMetre;

    public int getIdMetre() {
        return idMetre;
    }

    public void setIdMetre(int idMetre) {
        this.idMetre = idMetre;
    }
    
}