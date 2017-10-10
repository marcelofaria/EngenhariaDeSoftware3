/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author rafael
 */

enum tipoConta{
    Gerente, Caixa, Metre
}

public class Usuario {
    
    private tipoConta tipo;
    private int idFunc;
    private String hash;

    public tipoConta getTipo() {
        return tipo;
    }

    public void setTipo(tipoConta tipo) {
        this.tipo = tipo;
    }

    public int getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(int idFunc) {
        this.idFunc = idFunc;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }
    
    
    
}
