package model;

import java.util.*;

/**
 * 
 */
public class Conta {

    private int ID;
    private float valorTotal;
    private Date data;
    private Collection<Pedido> pedidos;


    public Conta(Collection<Pedido> pedidos, Date data) {
        this.pedidos = pedidos;
        this.data = data;
        this.getValorTotal();
    }

    public Collection<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(Collection<Pedido> pedidos) {
        this.pedidos = pedidos;
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
        this.valorTotal = 0;
        for(Pedido p : this.pedidos){
            this.valorTotal += p.getValor();
        }
    }

}