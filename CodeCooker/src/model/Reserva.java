package model;

import java.sql.Time;
import java.util.*;

/**
 * 
 */
public class Reserva {

    /**
     * Creates an object of type Reserva
     * @param numMesa
     * @param nome
     * @param horario
     * @param numPessoas
     * @param telefone
     */
    public Reserva(int idReserva, int numMesa, String nome, Time horario, int numPessoas, String telefone) {
        this.idReserva = idReserva;
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
    private int numMesa;

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
    private int numPessoas;

    /**
     * 
     */
    private String telefone;
    

    public int getNumMesa() {
        return numMesa;
    }

    public void setNumMesa(int numMesa) {
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

    public int getNumPessoas() {
        return numPessoas;
    }

    public void setNumPessoas(int numPessoas) {
        this.numPessoas = numPessoas;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
}