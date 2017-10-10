package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class Caixa extends Funcionario {

    private int ID;

    public int getID() {
        return ID;
    }
    
    public Caixa(String nome, String cpf) {
        super(nome, cpf);
        
    }
    
}