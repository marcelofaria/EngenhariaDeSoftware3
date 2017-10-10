package model;

import java.sql.Time;
import java.util.*;

/**
 * 
 */
public class Reserva {

    /**
     * Default constructor
     */
    public Reserva(short numMesa, String nome, Time horario, short numPessoas, String telefone) {
        this.numMesa = numMesa;
        this.nome = nome;
        this.horario = horario;
        this.numPessoas = numPessoas;
        this.telefone = telefone;
    }
    
    /**
     * 
     */
    private int idReserva;

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    /**
     * 
     */
    private short numMesa;

    /**
     * 
     */
    private String nome;

    /**
     * 
     */
    private Time horario;

    /**
     * 
     */
    private short numPessoas;

    /**
     * 
     */
    private String telefone;
    

    public short getNumMesa() {
        return numMesa;
    }

    public void setNumMesa(short numMesa) {
        this.numMesa = numMesa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Time getHorario() {
        return horario;
    }

    public void setHorario(Time horario) {
        this.horario = horario;
    }

    public short getNumPessoas() {
        return numPessoas;
    }

    public void setNumPessoas(short numPessoas) {
        this.numPessoas = numPessoas;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
}