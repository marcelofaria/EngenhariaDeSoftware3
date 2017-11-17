package model;


import java.util.*;

/**
 * 
 */
public class ItemPedido {

    private int pedidoID;

    /**
     * Default constructor
     */
    public ItemPedido(Item item, int pedidoID, int qtd) {
        this.item = item;
        this.pedidoID = pedidoID;
        this.qtd = qtd;
        this.valor = this.calcularValor(this.item.getPreco(), qtd);
    }
    
    /**
     * 
     */
    private int qtd;

    /**
     * 
     */
    private float valor;
    

    /**
     * 
     */
    private Item item;
    
    /**
     * 
     */
    private Pedido pedido;

    public int getPedidoID() {
        return pedidoID;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    /**
     * @return
     */
    public float calcularValor(float preco, int qtd) {
        return (preco * qtd);
    }

}