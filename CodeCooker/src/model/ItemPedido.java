package model;


import java.util.*;

/**
 * 
 */
public class ItemPedido {

    /**
     * Default constructor
     */
    public ItemPedido(Item item, int qtd) {
        this.item = item;
        this.qtd = qtd;
        this.valor = this.calcularValor(this.item.getPreco(), qtd);
    }

    /**
     * 
     */
    private int idItemPedido;
    
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

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }


   public int getIdItemPedido() {
        return idItemPedido;
    }

    public void setIdItemPedido(int idItemPedido) {
        this.idItemPedido = idItemPedido;
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