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

    public Conta(int ID, int numMesa, Calendar data, boolean status) {
        this.ID = ID;
        this.data = data;
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