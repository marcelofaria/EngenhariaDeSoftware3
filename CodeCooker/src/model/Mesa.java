package model;

import java.util.*;

/**
 * 
 */
public class Mesa {

    /**
     * Default constructor
     */
    public Mesa(int numMesa, int status) {
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
    private int status;
    

    public int getNumMesa() {
        return numMesa;
    }

    public void setNumMesa(int numMesa) {
        this.numMesa = numMesa;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}