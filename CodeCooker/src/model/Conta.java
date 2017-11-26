package model;

import java.util.*;

/**
 * 
 */
public class Conta {

    private final int ID;
    private Calendar data;
    private int numMesa;
    private boolean status;
    private double valorTotal;

    public Conta(int ID, int numMesa, double valorTotal, Calendar data, boolean status) {
        this.ID = ID;
        this.numMesa = numMesa;
        this.status = status;
        this.valorTotal = valorTotal;
        this.data = data;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public int getId() {
        return ID;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public int getNumMesa() {
        return numMesa;
    }

    public void setNumMesa(int numMesa) {
        this.numMesa = numMesa;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}