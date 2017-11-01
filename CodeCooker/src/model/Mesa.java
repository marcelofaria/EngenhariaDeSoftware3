package model;

import java.util.*;

/**
 * 
 */
public class Mesa {

    /**
     * Default constructor
     */
    public Mesa(int numMesa, boolean status) {
        this.numMesa = numMesa;
        this.status = status;
    }

    /**
     * 
     */
    private int numMesa;

    /**
     * 
     */
    private boolean status;
    

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