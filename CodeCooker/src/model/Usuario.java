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

public class Usuario {
    
    private int usuarioID;
    private int tipoUsuario;
    private String nome;
    private String cpf;
    private String cnpj;

    Usuario(String nome, String cpf, int tipo, String cnpj){
        this.nome = nome;
        this.cpf = cpf;
        this.tipoUsuario = tipo;
        this.cnpj = cnpj;
    }
    
    public int getUsuarioID() {
        return usuarioID;
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
}
