package model;    
import java.util.*;
import model.ItemPedido;

/**
 * 
 */
public class Pedido {

    /**
     * Default constructor
     */
    public Pedido(List<ItemPedido> itens) {
        this.itens = itens;
        this.valor = 0;
        for(ItemPedido i : itens){
            this.valor += i.getValor();
        }
    }

    /**
     * 
     */
    private float valor;

    /**
     * 
     */
    private List<ItemPedido> itens;

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }

}