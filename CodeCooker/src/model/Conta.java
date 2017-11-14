package model;

import java.util.*;

/**
 * 
 */
public class Conta {

    private int ID;
    private double valorTotal;
    private Calendar data;
    private Collection<Pedido> pedidos;


    public Conta(int ID, Collection<Pedido> pedidos, Calendar data) {
        this.ID = ID;
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

    public double getValorTotal() {
        this.calcularValorTotal();
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public void calcularValorTotal() {
        this.valorTotal = 0;
        for(Pedido p : this.pedidos){
            this.valorTotal += p.getValor();
        }
    }

}