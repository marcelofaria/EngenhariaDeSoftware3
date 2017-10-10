package model;

import java.util.*;

/**
 * 
 */
public class Conta {

    private int ID;
    private float valorTotal;
    private Date data;

    public Conta(float valorTotal, Date data) {
        
        this.setData(data);
        this.setValorTotal(valorTotal);
        
    }

    public int getID() {
        return ID;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void calcularValorTotal() {
        // TODO implement here
    }

}