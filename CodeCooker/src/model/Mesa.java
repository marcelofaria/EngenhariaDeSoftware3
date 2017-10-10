package model;

import java.util.*;

/**
 * 
 */
public class Mesa {

    /**
     * Default constructor
     */
    public Mesa(short numMesa, boolean status) {
        this.numMesa = numMesa;
        this.status = status;
    }

    /**
     * 
     */
    private short numMesa;

    /**
     * 
     */
    private boolean status;
    

    public short getNumMesa() {
        return numMesa;
    }

    public void setNumMesa(short numMesa) {
        this.numMesa = numMesa;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}